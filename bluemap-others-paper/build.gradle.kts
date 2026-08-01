plugins {
    `bluemap-entities-bukkit-release`
}

project.description = project.property("bluemap-others-description").toString()

dependencies{
    implementation(project(":bluemap-others-bukkit-common"))
    compileOnly(libs.paper.api)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentities", "be.renaud11232.bluemapothers.bluemapentities")
}