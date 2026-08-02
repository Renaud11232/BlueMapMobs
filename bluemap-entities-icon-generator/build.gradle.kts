plugins {
    `bluemap-entities-java`
    id("application")
}

dependencies {
    implementation(libs.picocli)
}

application {
    mainClass = "be.renaud11232.bluemapentities.icongenerator.IconGeneratorCommand"
}
