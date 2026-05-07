import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    alias(libs.plugins.shadow) apply false
}

subprojects {
    repositories {
        mavenCentral()
        maven("https://repo.bluecolored.de/releases")
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://maven.citizensnpcs.co/repo")
    }
    plugins.withType<JavaPlugin> {
        configure<JavaPluginExtension> {
            toolchain {
                languageVersion = JavaLanguageVersion.of(25)
            }
        }
        tasks.withType<ProcessResources> {
            val projectVersion = project.version.toString()
            val bukkitApiVersion = project.property("bukkit-api-version").toString()
            val projectDescription = project.description.toString()
            val website = project.property("website").toString()
            filesMatching("plugin.yml") {
                expand(
                    "version" to projectVersion,
                    "apiVersion" to bukkitApiVersion,
                    "description" to projectDescription,
                    "website" to website
                )
            }
        }
    }
    plugins.withType<ShadowPlugin> {
        tasks.withType<ShadowJar> {
            archiveClassifier = ""
            destinationDirectory = project.layout.buildDirectory.dir("release")
        }
    }
}
