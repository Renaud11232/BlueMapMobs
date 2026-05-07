plugins {
    id("java")
    alias(libs.plugins.shadow)
}

description = "Plugin adding mob markers on your BlueMap maps"

dependencies{
    implementation(project(":bluemap-mobs-bukkit-common"))
    compileOnly(libs.spigot.api)
}
