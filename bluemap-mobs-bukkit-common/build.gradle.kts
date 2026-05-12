plugins {
    `bluemap-entities-java`
}

dependencies{
    compileOnlyApi(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-mobs-api"))
    compileOnly(libs.spigot.api)
}
