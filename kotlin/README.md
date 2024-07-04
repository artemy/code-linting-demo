# Kotlin linting demo

Hybrid maven + gradle project.

Code contains formatting style violations (unused imports).

## Prerequisites

Make sure to install `rules-artifact` locally (see [rules-artifact](../rules-artifact/README.md))

## Maven

### Detekt

Run detekt:

```shell
mvn detekt:check
```

Detekt is also integrated into `verify`:

```shell
mvn verify
```

### Versions

Run versions-plugin:

```shell
mvn versions:display-property-updates
```

## Gradle

Run detekt:

### Detekt

```shell
gradle detekt
```

`detekt` task is also integrated into `check`:

```shell
gradle check
```
