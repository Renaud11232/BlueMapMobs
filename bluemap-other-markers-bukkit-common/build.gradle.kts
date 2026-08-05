plugins {
    `bluemap-entity-markers-java`
}

dependencies {
    api(project(":bluemap-entity-markers-bukkit-common"))
    api(project(":bluemap-other-markers-common"))
    compileOnly(libs.spigot.api)
}
