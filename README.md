**A- XML Based**
src/main/java/com/example/springxml/CalculatorImplXml.java
src/main/resources/beans.xml
src/main/java/com/example/springxml/XmlApp.java

mvn compile exec:java -Dexec.mainClass=com.example.springxml.XmlApp

**B — Java-based configuration (@Configuration + @Bean)**

src/main/java/com/example/springxml/CalculatorImplJavaCfg.java
src/main/java/com/example/springxml/AppConfigJava.java
src/main/java/com/example/springxml/JavaConfigApp.java

mvn compile exec:java -Dexec.mainClass=com.example.springxml.JavaConfigApp


****C — Annotations-based (component scanning + @Component + @Autowired) ****
src/main/java/com/example/springxml/CalculatorComponent.java
src/main/java/com/example/springxml/CalculatorUser.java
src/main/java/com/example/springxml/AppConfigAnnotation.java
src/main/java/com/example/springxml/AnnotationApp.java
mvn compile exec:java -Dexec.mainClass=com.example.springxml.AnnotationApp










