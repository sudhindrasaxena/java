Used following versions in example -  
    <b>1. Java 8 <br>
    2. Spring Boot 2.0.2.RELEASE  
    3. MySQL 8<br>
    4. Spring Data JPA</b> 

Database setup scripts can be downloaded from here - 
https://dev.mysql.com/doc/index-other.html

Path for application.properties has to be passed using the below param while starting the server since any cred config should never be part of source code - <br><br>
        <b>--spring.config.location=D:\app_config\application.properties (Windows Location)

Sample application.properties - <br>
<b><br>
spring.datasource.url=jdbc:mysql://localhost:3306/database_name<br>
spring.datasource.username=mysql<br>
spring.datasource.password=mysql<br>
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
