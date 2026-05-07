plugins {
    id("java-library")
}

dependencies{
    compileOnlyApi(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-others-api"))
    compileOnly(libs.spigot.api)
}
