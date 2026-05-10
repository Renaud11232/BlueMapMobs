import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    alias(libs.plugins.shadow) apply false
}

allprojects {
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
                languageVersion = JavaLanguageVersion.of(Integer.parseInt(project.property("java-version").toString()))
            }
        }
    }
}

subprojects {
    plugins.withType<JavaPlugin> {
        tasks.withType<ProcessResources> {
            val projectVersion = project.version.toString()
            val bukkitApiVersion = project.property("bukkit-api-version").toString()
            val projectDescription = project.description.toString()
            val website = project.property("website").toString()
            val javaVersion = project.property("java-version").toString()
            filesMatching("plugin.yml") {
                expand(
                    "version" to projectVersion,
                    "apiVersion" to bukkitApiVersion,
                    "description" to projectDescription,
                    "website" to website
                )
            }
            filesMatching("fabric.mod.json") {
                expand(
                    "version" to projectVersion,
                    "description" to projectDescription,
                    "website" to website,
                    "fabricLoaderVersion" to libs.versions.fabric.loader.get(),
                    "minecraftVersion" to libs.versions.minecraft.get(),
                    "javaVersion" to javaVersion
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
