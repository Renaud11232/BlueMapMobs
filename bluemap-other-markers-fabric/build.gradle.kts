plugins {
    `bluemap-entity-markers-fabric-release`
}

project.description = project.property("bluemap-other-markers-description").toString()

dependencies {
    shadow(project(":bluemap-entity-markers-fabric-common"))
    shadow(project(":bluemap-other-markers-common"))
    minecraft(libs.minecraft)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapothermarkers.bluemapentitymarkers")
}