Swagger Maven Plugin Example [![Build Status](https://travis-ci.org/kongchen/swagger-maven-example.png)](https://travis-ci.org/kongchen/swagger-maven-example)
With [JAX-RESTEASY](https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-RESTEasy-2.X-Project-Setup-1.5#using-a-custom-application-subclass).
With [exaple](https://github.com/swagger-api/swagger-samples/tree/master/java/java-resteasy). 
This project is an example of using [Swagger-maven-plugin](https://github.com/kongchen/swagger-maven-plugin).

You can check the detail configuration in [pom.xml](https://github.com/kongchen/swagger-maven-example/blob/master/pom.xml#L40-L49)

Clone the example in local and then launch:
```
mvn compile
```
You'll get the outputs in the */generated* folder.

```
- Copy generated/swagger.json and document.html in src/webapp 
- run "mvn clean install" 
- deploy war in wildfly 8 or greater

remember than i have copied the swagger-ui/dist github directory 
in src/webapp of content (maybe you need to update from here):
```
[swagger-ui](https://github.com/swagger-api/swagger-ui/blob/master/dist/).

open browser on [index.html](http://localhost:8080/swagger-maven-example/index.html). (you can test apis)

or to see api documentation only open [document.html](http://localhost:8080/swagger-maven-example/document.html).

if you wanna check [swagger.json](http://localhost:8080/swagger-maven-example/swagger.json). 

if you wanna run rest services if works check for example [petStore service rest: find a pet with id=1](http://localhost:8080/swagger-maven-example/rest/pet/1).

>If you wanna see something before clone, I've uploaded the output files, you can view swagger outputs at 
[here](https://github.com/kongchen/swagger-maven-example/blob/master/generated/swagger-ui), and 
[view the HTML output document](http://htmlpreview.github.io/?https://raw.github.com/kongchen/swagger-maven-example/master/generated/document.html) 

*Enjoy!*
