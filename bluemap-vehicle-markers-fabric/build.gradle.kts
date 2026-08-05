plugins {
    `bluemap-entity-markers-fabric-release`
}

project.description = project.property("bluemap-vehicle-markers-description").toString()

dependencies {
    shadow(project(":bluemap-entity-markers-fabric-common"))
    shadow(project(":bluemap-vehicle-markers-common"))
    minecraft(libs.minecraft)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapvehiclemarkers.bluemapentitymarkers")
}