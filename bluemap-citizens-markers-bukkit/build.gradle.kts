plugins {
    `bluemap-entity-markers-bukkit-release`
}

project.description = project.property("bluemap-citizens-markers-description").toString()

dependencies {
    implementation(project(":bluemap-entity-markers-bukkit-common"))
    compileOnly(libs.spigot.api)
    compileOnly(libs.citizens.main) {
        exclude(group = "*", module = "*")
    }
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentitymarkers", "be.renaud11232.bluemapcitizensmarkers.bluemapentitymarkers")
}