# Task

Command to switch jar file

#### For Library A,

```
java -cp main-0.0.1-SNAPSHOT.jar:libraryA-0.0.1-SNAPSHOT.jar:strategy-0.0.1-SNAPSHOT.jar  org.springframework.boot.loader.PropertiesLauncher
```

#### For Library B,

```
java -cp main-0.0.1-SNAPSHOT.jar:libraryB-0.0.1-SNAPSHOT.jar:strategy-0.0.1-SNAPSHOT.jar  org.springframework.boot.loader.PropertiesLauncher
```

#### For Library C,

```
java -cp main-0.0.1-SNAPSHOT.jar:libraryC-0.0.1-SNAPSHOT.jar:strategy-0.0.1-SNAPSHOT.jar  org.springframework.boot.loader.PropertiesLauncher
```

Api End Point Url -> localhost:8080/api/play?file={name}
