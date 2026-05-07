plugins {
    id("java")
    alias(libs.plugins.shadow)
}

description = "Plugin adding vehicle markers on your BlueMap maps"

dependencies{
    compileOnly(project(":bluemap-entities-bukkit"))
    implementation(project(":bluemap-vehicles-api"))
    compileOnly(libs.spigot.api)
}
