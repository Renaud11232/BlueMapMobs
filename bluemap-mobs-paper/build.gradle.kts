plugins {
    `bluemap-entities-bukkit-release`
}

project.description = project.property("bluemap-mobs-description").toString()

dependencies{
    implementation(project(":bluemap-mobs-bukkit-common"))
    compileOnly(libs.paper.api)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentities", "be.renaud11232.bluemapmobs.bluemapentities")
}