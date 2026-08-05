plugins {
    `bluemap-entity-markers-bukkit-release`
}

project.description = "Plugin adding markers on your BlueMap maps for other entities than mobs and vehicles"

dependencies {
    implementation(project(":bluemap-other-markers-bukkit-common"))
    compileOnly(libs.spigot.api)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapothermarkers.bluemapentitymarkers")
}