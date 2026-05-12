plugins {
    `bluemap-entities-bukkit-release`
}

project.description = project.property("bluemap-entities-description").toString()

dependencies{
    api(project(":bluemap-entities-api"))
    compileOnly(libs.spigot.api)
}
