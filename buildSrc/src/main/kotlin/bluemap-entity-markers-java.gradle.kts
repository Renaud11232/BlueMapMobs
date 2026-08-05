plugins {
    id("java-library")
}

repositories {
    mavenCentral()
    maven("https://repo.bluecolored.de/releases")
    maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://maven.citizensnpcs.co/repo")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(Integer.parseInt(project.property("java-version").toString()))
    }
}