plugins {
    id("java-library")
}

dependencies{
    compileOnlyApi(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-mobs-api"))
    compileOnly(libs.spigot.api)
}
