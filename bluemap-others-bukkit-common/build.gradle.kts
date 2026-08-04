plugins {
    `bluemap-entities-java`
}

dependencies {
    api(project(":bluemap-entities-bukkit-common"))
    api(project(":bluemap-others-common"))
    compileOnly(libs.spigot.api)
}
