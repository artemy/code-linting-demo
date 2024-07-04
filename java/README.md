# Java linting demo

Hybrid maven + gradle project.

Code contains formatting style violations (wrong indentation).

## Prerequisites

Make sure to install `rules-artifact` locally (see [rules-artifact](../rules-artifact/README.md))

## Maven

### Checkstyle

Run checkstyle:

```shell
mvn checkstyle:check
```

Checkstyle is also integrated into `verify`:

```shell
mvn verify
```

### Versions

Run versions-plugin:

```shell
mvn versions:display-property-updates
```

## Gradle

Run checkstyle:

### Checkstyle

```shell
gradle checkstyleMain checkstyleTest
```

`checkstyle` task is also integrated into `check`:

```shell
gradle check
```
