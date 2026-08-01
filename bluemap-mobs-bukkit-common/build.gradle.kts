plugins {
    `bluemap-entities-java`
}

dependencies{
    api(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-mobs-api"))
    compileOnly(libs.spigot.api)
}
