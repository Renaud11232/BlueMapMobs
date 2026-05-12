plugins {
    `bluemap-entities-fabric-release`
}

project.description = project.property("bluemap-others-description").toString()

dependencies {
    compileOnly(project(":bluemap-entities-fabric"))
    shadow(project(":bluemap-others-api"))
    minecraft(libs.minecraft)
    implementation(libs.fabric.loader)
}
