plugins {
    `bluemap-entities-java`
}

dependencies {
    api(project(":bluemap-entities-bukkit"))
    api(project(":bluemap-others-common"))
    compileOnly(libs.spigot.api)
}
