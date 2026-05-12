plugins {
    `bluemap-entities-bukkit-release`
}

project.description = project.property("bluemap-citizens-description").toString()

dependencies{
    compileOnly(project(":bluemap-entities-bukkit"))
    compileOnly(libs.spigot.api)
    compileOnly(libs.citizens.main) {
        exclude(group = "*", module = "*")
    }
}
