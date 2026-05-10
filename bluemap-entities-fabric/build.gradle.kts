plugins {
    id("java-library")
    alias(libs.plugins.fabric.loom)
    alias(libs.plugins.shadow)
}

description = "Base plugin allowing to add entity markers to your BlueMap maps"

//TODO: improve this to better handle common configurations
val shadowInclude: Configuration by configurations.creating
configurations.api.get().extendsFrom(shadowInclude)

dependencies {
    shadowInclude(project(":bluemap-entities-api"))
    minecraft(libs.minecraft)
    compileOnly(libs.fabric.loader)
    compileOnly(libs.fabric.api)
}

tasks.shadowJar {
    configurations = listOf(shadowInclude)
}