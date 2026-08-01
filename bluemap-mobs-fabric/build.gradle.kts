plugins {
    `bluemap-entities-fabric-release`
}

project.description = project.property("bluemap-mobs-description").toString()

dependencies {
    shadow(project(":bluemap-entities-fabric"))
    shadow(project(":bluemap-mobs-api"))
    minecraft(libs.minecraft)
    implementation(libs.fabric.loader)
}
