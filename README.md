# Orezia Tri API

![Java version](https://img.shields.io/badge/java-^17-yellow)
![MC version](https://img.shields.io/badge/MC-v1.19.2-green)
[![GitHub release](https://img.shields.io/badge/release-v1.0-blue)](https://github.com/Orezia/OreziaTri-API/releases/tag/v1.0)

[![Maven build](https://github.com/Orezia/OreziaTri-API/actions/workflows/maven_build.yml/badge.svg)](https://github.com/Orezia/OreziaTri-API/actions/workflows/maven_build.yml)

Public API for the `OreziaTri` plugin.

[Version française](./LISEZMOI.md)

## Table of contents :

- [Integrating](#integrating-)
  - [Soft-dependency](#soft-dependency-)
  - [Hard-dependency](#hard-dependency-)
- [Version](#version-)

## Integrating :

In order to integrate your plugin with `OreziaTri`, you have to add `OreziaTri-API` as dependency of your project.

Maven :

```xml
<repositories>
  <repository>
    <id>github-orezia-tri-api</id>
    <url>https://maven.pkg.github.com/Orezia/OreziaTri-API</url>
  </repository>
</repositories>
```

```xml
<dependencies>
  <dependency>
    <groupId>fr.orezia.mc</groupId>
    <artifactId>oreziatri-api</artifactId>
    <version>VERSION</version>
  </dependency>
</dependencies>
```

Gradle :

```groovy
repositories {
    maven {
        name = "GithubOreziaTriApi"
        url = uri("https://maven.pkg.github.com/Orezia/OreziaTri-API")
    }
}
```

```groovy
dependencies {
    implementation group: 'fr.orezia.mc', name: 'OreziaTri-API', version: VERSION
}
```

### Soft-dependency :

In order to add `OreziaTri` as soft-dependency, you have to shade the dependency `OreziaTri-API` in your plugin (i.e. include the dependency in your plugin JAR).

### Hard-dependency :

If your plugin is hard-dependent on `OreziaTri`, you can consider the dependency `OreziaTri-API` as provided.

## Version :

- __v1.1__
  - Préparation de la prochaine version
- __[v1.0](https://github.com/Orezia/OreziaTri-API/releases/tag/v1.0)__
  - \+ Function to check if an item can be placed into an inventory
  - \+ Function to get the blacklist of a player
  - \+ Function to get a filter from an inventory
  - \+ Definition of a filter
