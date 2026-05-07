plugins {
    id("java-library")
    alias(libs.plugins.shadow)
}

description = "Base plugin allowing to add entity markers to your BlueMap maps"

dependencies{
    api(project(":bluemap-entities-api"))
    compileOnly(libs.spigot.api)
}
