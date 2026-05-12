plugins {
    `bluemap-entities-fabric-release`
}

project.description = project.property("bluemap-entities-description").toString()

dependencies {
    shadow(project(":bluemap-entities-api"))
    minecraft(libs.minecraft)
    implementation(libs.fabric.loader)
    implementation(libs.fabric.api)
}
