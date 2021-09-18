# OreziaTri public API

![Java version](https://img.shields.io/badge/java-^16-green)
![MC version](https://img.shields.io/badge/MC-v1.17-blue)
[![GitHub release](https://img.shields.io/badge/release-v1.0-blue)](https://github.com/Orezia/OreziaTri-api/releases/tag/1.0)

[version française](./LISEZMOI.md)

## Table of contents :

- [Integrating](#integrating-)
- [Version](#version-)

## Integrating :

In order to integrate your plugin with OreziaTri, you have to `OreziaTri-api` as dependency of your project.

Gradle :

```groovy
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/Orezia/OreziaTri-api")
    }
}

dependencies {
    implementation group: 'fr.orezia.mc', name: 'OreziaTri-api', version: VERSION
}
```

### Soft-depend

In order to add OreziaTri as soft-depend, you have to shade the dependency `OreziaTri-api` in your plugin (Include the dependency in your plugin JAR).

### Hard-depend

If your plugin hard-depend on OreziaTri, you can consider the dependency `OreziaTri-api` as provided.

## Version :

- __1.0__: Initial version
