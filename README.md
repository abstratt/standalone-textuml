 
[![Build Status on Cloudbees](https://textuml.ci.cloudbees.com/buildStatus/icon?job=standalone-textuml)](https://textuml.ci.cloudbees.com/job/standalone-textuml/)
[![Build Status on Travis CI](https://travis-ci.org/abstratt/standalone-textuml.svg?branch=master)](https://travis-ci.org/abstratt/standalone-textuml.svg?branch=master)

This project allows one to execute the [TextUML compiler](http://abstratt.github.io/textuml/) as a regular Java application.

To execute, unpack the latest deployment bundle zip file from [here](https://repository-textuml.forge.cloudbees.com/snapshot/com/abstratt/mdd/com.abstratt.mdd.frontend.cli.standalone/2.2.201606-SNAPSHOT/), and run:

```
java -Dargs.input=some-textuml-directory -jar plugins/com.abstratt.mdd.frontend.cli.standalone-2.2.201606-SNAPSHOT.jar
```
