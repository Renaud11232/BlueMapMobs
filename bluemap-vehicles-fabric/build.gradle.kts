plugins {
    id("java-library")
    alias(libs.plugins.fabric.loom)
    alias(libs.plugins.shadow)
}

description = "Plugin adding markers on your BlueMap maps for other entities than mobs and vehicles"

val shadowInclude: Configuration by configurations.creating
configurations.implementation.get().extendsFrom(shadowInclude)

dependencies {
    compileOnly(project(":bluemap-entities-fabric"))
    shadowInclude(project(":bluemap-vehicles-api"))
    minecraft(libs.minecraft)
    compileOnly(libs.fabric.loader)
}

tasks.shadowJar {
    configurations = listOf(shadowInclude)
}