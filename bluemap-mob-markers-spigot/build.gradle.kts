plugins {
    `bluemap-entity-markers-bukkit-release`
}

project.description = project.property("bluemap-mob-markers-description").toString()

dependencies {
    implementation(project(":bluemap-mob-markers-bukkit-common"))
    compileOnly(libs.spigot.api)
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapmobmarkers.bluemapentitymarkers")
}