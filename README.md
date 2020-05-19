How to read a nested object from the standard application.properties with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readANestedObjectFromStandardPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties<br/>
myNestedObject.myString=qwerty<br/>
---MyConfigurationBean.java<br/>
<b>private MyNestedObject myNestedObject;</b><br/>
&nbsp;&nbsp;<b>public static class MyNestedObject</b> {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;private String myString;<br/>
&nbsp;&nbsp;&nbsp;&nbsp;+getter and setter of myString<br/>
&nbsp;&nbsp;}<br/>
&nbsp;&nbsp;+getter and setter of myNestedObject<br/>
---The class who displays the value of the 'myNestedObject.myString' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyNestedObject().getMyString());<br/>
<br/>
<br/>
The application will read the value 'qwerty' of the property myNestedObject.myString in the standard application.properties configuration file then display it in the terminal.<br/>


