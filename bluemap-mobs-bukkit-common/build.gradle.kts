plugins {
    `bluemap-entities-java`
}

dependencies{
    api(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-mobs-common"))
    compileOnly(libs.spigot.api)
}
