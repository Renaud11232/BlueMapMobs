plugins {
    `bluemap-entities-fabric-java`
}

dependencies {
    api(project(":bluemap-entities-api"))
    minecraft(libs.minecraft)
    compileOnlyApi(libs.fabric.loader)
    compileOnlyApi(libs.fabric.api)
}
