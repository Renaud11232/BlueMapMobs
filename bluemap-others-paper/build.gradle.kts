plugins {
    id("java")
    alias(libs.plugins.shadow)
}

description = "Plugin adding markers on your BlueMap maps for other entities than mobs and vehicles"

dependencies{
    implementation(project(":bluemap-others-bukkit-common"))
    compileOnly(libs.paper.api)
}
