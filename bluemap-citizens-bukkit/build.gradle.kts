plugins {
    `bluemap-entities-bukkit-release`
}

project.description = project.property("bluemap-citizens-description").toString()

dependencies {
    implementation(project(":bluemap-entities-bukkit"))
    compileOnly(libs.spigot.api)
    compileOnly(libs.citizens.main) {
        exclude(group = "*", module = "*")
    }
}

tasks.shadowJar {
    relocate("be.renaud11232.bluemapentities", "be.renaud11232.bluemapcitizens.bluemapentities")
}