import { defineConfig } from "vite";
import { viteSingleFile } from "vite-plugin-singlefile";

export default defineConfig({
  json: {
    namedExports: false,
  },
  plugins: [viteSingleFile()],
});
