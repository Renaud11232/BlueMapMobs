plugins {
    `bluemap-entity-markers-java`
    id("application")
}

dependencies {
    implementation(libs.picocli)
}

application {
    mainClass = "be.renaud11232.bluemapentitymarkers.icongenerator.IconGeneratorCommand"
}
