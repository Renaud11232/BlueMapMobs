plugins {
    id("java")
    alias(libs.plugins.shadow)
}

description = "Plugin adding Citizens NPCs markers on your BlueMap maps"

dependencies{
    compileOnly(project(":bluemap-entities-bukkit"))
    compileOnly(libs.spigot.api)
    compileOnly(libs.citizens.main) {
        exclude(group = "*", module = "*")
    }
}
