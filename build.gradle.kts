plugins {
    this.`java-library`
    this.`maven-publish`
    this.id("co.uzzu.dotenv.gradle") version "1.2.0"
}

// region properties

// Properties from file `gradle.properties`

/**
 * Version of OreziaRankUp-API to use.
 */
val apiVersion: String by project

/**
 * Archive base name: "base_name"-"version".jar
 */
val archiveBaseName: String by project

/**
 * Version of OreziaCore to use.
 */
val coreVersion: String by project

/**
 * Version of the plugin.
 */
val pluginVersion: String by project

/**
 * GitHub username. Gets from system environment (GITHUB_ACTOR) or .env file (USERNAME).
 */
val githubUsername: String = System.getenv("GITHUB_ACTOR") ?: env.USERNAME.value

/**
 * GitHub token. Gets from system environment (GITHUB_TOKEN) or .env file (TOKEN).
 */
val githubToken: String = System.getenv("GITHUB_TOKEN") ?: env.TOKEN.value

// endregion

group = "fr.orezia.mc"
version = "1.0-SNAPSHOT"

java {
    this.sourceCompatibility = JavaVersion.VERSION_16
    this.targetCompatibility = JavaVersion.VERSION_16
    this.withJavadocJar()
    this.withSourcesJar()
}

repositories {
    this.mavenLocal()
    this.mavenCentral {
        this.content {
            this.excludeGroup("fr.orezia.mc")
        }
    }
    this.maven {
        this.name = "GitHubPackages"
        this.url = uri("https://maven.pkg.github.com/Orezia/OreziaCore-API")
        this.credentials {
            this.username = githubUsername
            this.password = githubToken
        }
        this.content {
            this.includeGroup("fr.orezia.mc")
        }
    }
    this.maven {
        this.url = uri("https://papermc.io/repo/repository/maven-public/")
        this.content {
            this.excludeGroup("fr.orezia.mc")
        }
    }
}

dependencies {
    this.api("fr.orezia.mc:oreziacore-api:1.0-SNAPSHOT")
}

publishing {
    this.repositories {
        this.maven {
            this.name = "GitHubPackages"
            this.url = uri("https://maven.pkg.github.com/Orezia/OreziaTri-api")
            this.credentials {
                this.username = githubUsername
                this.password = githubToken
            }
        }
    }
    this.publications {
        this.create<MavenPublication>("gpr") {
            this.from(components.findByName("java"))
        }
    }
}
