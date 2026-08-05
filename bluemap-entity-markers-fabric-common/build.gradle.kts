plugins {
    `bluemap-entity-markers-fabric`
}

dependencies {
    api(project(":bluemap-entity-markers-common"))
    minecraft(libs.minecraft)
    compileOnlyApi(libs.fabric.loader)
    compileOnlyApi(libs.fabric.api)
}
