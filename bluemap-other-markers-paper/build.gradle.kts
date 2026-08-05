plugins {
    `bluemap-entity-markers-bukkit-release`
}

project.description = project.property("bluemap-other-markers-description").toString()

dependencies {
    implementation(project(":bluemap-other-markers-bukkit-common"))
    compileOnly(libs.paper.api)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapothermarkers.bluemapentitymarkers")
}