
This project allows one to execute the [TextUML compiler](http://abstratt.github.io/textuml/) as a regular Java application.

### Building

```mvn clean install```

### Running

```
unzip -d install ./com.abstratt.mdd.frontend.cli.standalone/target/com.abstratt.mdd.frontend.cli.standalone-2.2.201606-SNAPSHOT-deployment-bundle.zip

java -Dargs.input=some-textuml-directory -jar install/plugins/com.abstratt.mdd.frontend.cli.standalone-2.2.201606-SNAPSHOT.jar
```
