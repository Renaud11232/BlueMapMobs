plugins {
    `bluemap-entities-fabric-release`
}

project.description = project.property("bluemap-others-description").toString()

dependencies {
    shadow(project(":bluemap-entities-fabric"))
    shadow(project(":bluemap-others-api"))
    minecraft(libs.minecraft)
    implementation(libs.fabric.loader)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentities", "be.renaud11232.bluemapothers.bluemapentities")
}