plugins {
    `bluemap-entities-java`
}

dependencies{
    api(project(":bluemap-entities-common"))
    compileOnly(libs.spigot.api)
}
