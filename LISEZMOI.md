# Orezia Tri API

![Java version](https://img.shields.io/badge/java-^17-yellow)
![MC version](https://img.shields.io/badge/MC-v1.18.1-green)
[![GitHub release](https://img.shields.io/badge/release-vX-blue)](https://github.com/dederobert/OreziaTri-API/releases/tag/X)

[![Maven build](https://github.com/Orezia/OreziaTri-API/actions/workflows/maven_build.yml/badge.svg)](https://github.com/Orezia/OreziaTri-API/actions/workflows/maven_build.yml)

API publique pour le plugin `OreziaTri`.

[English version](./README.md)

## Table des matières :

- [Intégration](#intergration-)
  - [Soft-dépendance](#soft-dependance-)
  - [Hard-dépendance](#hard-dependance-)
- [Version](#version-)

## Intégration :

Pour intégrer votre plugin avec `OreziaTri`, vous devez ajouter `OreziaTri-API` parmi les dépendances de votre projet.

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

### Soft-dépendance

Pour être soft-dépendant d'`OreziaTri`, vous devez embarquer la dépendance `OreziaTri-API` dans votre plugin (c'est-à-dire inclure la dépendance dans le JAR de votre plugin).

### Hard-dépendance :

Si votre plugin est hard-dépendant d'`OreziaTri`, vous pouvez considérer la dépendance `OreziaTri-API` comme "provided".

## Version :

- __1.0__
  - TODO
