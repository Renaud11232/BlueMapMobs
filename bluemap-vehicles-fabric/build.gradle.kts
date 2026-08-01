plugins {
    `bluemap-entities-fabric-release`
}

project.description = project.property("bluemap-vehicles-description").toString()

dependencies {
    shadow(project(":bluemap-entities-fabric"))
    shadow(project(":bluemap-vehicles-api"))
    minecraft(libs.minecraft)
    implementation(libs.fabric.loader)
}
