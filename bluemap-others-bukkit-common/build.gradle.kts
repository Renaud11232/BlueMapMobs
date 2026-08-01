plugins {
    `bluemap-entities-java`
}

dependencies{
    api(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-others-api"))
    compileOnly(libs.spigot.api)
}
