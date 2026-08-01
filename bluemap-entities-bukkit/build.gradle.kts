plugins {
    `bluemap-entities-java`
}

dependencies{
    api(project(":bluemap-entities-api"))
    compileOnly(libs.spigot.api)
}
