plugins {
    `bluemap-entities-fabric-release`
}

project.description = project.property("bluemap-vehicles-description").toString()

dependencies {
    shadow(project(":bluemap-entities-fabric"))
    shadow(project(":bluemap-vehicles-common"))
    minecraft(libs.minecraft)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentities", "be.renaud11232.bluemapvehicles.bluemapentities")
}