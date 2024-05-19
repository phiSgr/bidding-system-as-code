import java.lang.System.getProperty

plugins {
    kotlin("jvm") version "2.2.0"

    id("org.jetbrains.dokka") version "2.0.0"
    id("maven-publish")
    id("signing")
}

group = "com.github.phisgr"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.fasterxml.jackson.core:jackson-core:2.17.1")
}

task<JavaExec>("runTestMainClass") { // test equivalent for application
    dependsOn("testClasses")
    classpath = sourceSets["test"].runtimeClasspath
    mainClass.set(getProperty("mainClass"))
}

task<Exec>("buildHtml") {
    inputs.dir("../viewer/src")
    outputs.file("../viewer/dist/index.html")

    doFirst {
        project.file("build").mkdir()
        project.file("build/system.json").bufferedWriter().use {
            it.write("""{"name":"dummy","author":"file","description":"to be replaced","nextBids":[]}""")
        }
    }
    workingDir = project.file("../viewer")
    commandLine("pnpm", "run", "build")
}

@CacheableTask
open class GenerateHtmlResource : DefaultTask() {

    @get:InputFile
    @PathSensitive(PathSensitivity.RELATIVE)
    val inputFile: File = project.file("../viewer/dist/index.html")

    @get:OutputFile
    val outputFile: File = project.file("build/generated/resources/template.html")

    @TaskAction
    fun generate() {
        project.file("../viewer/dist/index.html").copyTo(outputFile, overwrite = true)
    }
}

val generatorTask by tasks.registering(GenerateHtmlResource::class) {
    dependsOn(tasks["buildHtml"])
}
sourceSets {
    main {
        resources {
            srcDir(generatorTask.map { it.outputFile.parent })
        }
    }
}


java {
    withJavadocJar()
    withSourcesJar()
}
signing {
    useGpgCmd()
    sign(publishing.publications)
}

tasks.named<Jar>("javadocJar") {
    from(tasks.named("dokkaHtml"))
}
tasks.withType<Javadoc>().all { enabled = false }

publishing {
    repositories {
        maven {
            name = "ossrh-staging-api"
            setUrl("https://ossrh-staging-api.central.sonatype.com/service/local/staging/deploy/maven2/")
            credentials {
                username = project.properties["ossrhUsername"] as String?
                password = project.properties["ossrhPassword"] as String?
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {

            from(project.components["java"])

            pom {
                name.set("bidding-system-as-code")
                description.set("Contract bridge bidding system as code.")
                url.set("https://github.com/phiSgr/bidding-system-as-code")

                licenses {
                    license {
                        name.set("AGPL-v3.0")
                        url.set("https://www.gnu.org/licenses/agpl-3.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("phiSgr")
                        name.set("George Leung")
                        email.set("phisgr@gmail.com")
                    }
                }
                scm {
                    url.set("https://github.com/phiSgr/bidding-system-as-code")
                }
            }
        }
    }
}
