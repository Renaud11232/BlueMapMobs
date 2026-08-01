plugins {
    `bluemap-entities-bukkit-release`
}

project.description = project.property("bluemap-vehicles-description").toString()

dependencies{
    implementation(project(":bluemap-entities-bukkit"))
    implementation(project(":bluemap-vehicles-api"))
    compileOnly(libs.spigot.api)
}
