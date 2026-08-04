plugins {
    `bluemap-entities-fabric`
}

dependencies {
    api(project(":bluemap-entities-common"))
    minecraft(libs.minecraft)
    compileOnlyApi(libs.fabric.loader)
    compileOnlyApi(libs.fabric.api)
}
