plugins {
    `bluemap-entities-bukkit-release`
}

project.description = "Plugin adding markers on your BlueMap maps for other entities than mobs and vehicles"

dependencies{
    implementation(project(":bluemap-others-bukkit-common"))
    compileOnly(libs.spigot.api)
}
