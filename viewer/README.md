The first iteration of this project was built with Vuetify 2.
Because of my inability to tell Vue.js precisely which reactivity not to track,
the performance was not great.

The project eventually failed to build (yes I had a lockfile).
I started migrating it to Vuetify 3,
but I noticed some changes in the stylesheets between Vuetify 2 and 3.
I was already used to how the app looks.
Reproducing the same appearance with Vuetify 3 would be quite some work.
Additionally, I did not see a meaningful performance improvement, 
which further discouraged me from continuing the migration.

So, I decided to go a bit crazy:
I rebuilt the whole thing without using a framework.
I used jsx-dom to generate the same html nodes,
took the stylesheet from an older build and trimmed it down, and
managed the state manually - no reactivity.

So, here we are: an unmaintainable mess that is rather performant.

Why not React?
Because putting a Vuetify stylesheet in a React app would overload my irony sensor.
