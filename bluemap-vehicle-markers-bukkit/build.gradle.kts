plugins {
    `bluemap-entity-markers-bukkit-release`
}

project.description = project.property("bluemap-vehicle-markers-description").toString()

dependencies {
    implementation(project(":bluemap-entity-markers-bukkit-common"))
    implementation(project(":bluemap-vehicle-markers-common"))
    compileOnly(libs.spigot.api)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapvehiclemarkers.bluemapentitymarkers")
}