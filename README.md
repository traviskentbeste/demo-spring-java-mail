# demo-spring-java-mail
Demo Spring Java Mail

Table of contents
=================
<!--ts-->
   * [Installation](#installation)
   * [H2 Database](#h2-database)
   * [Endpoints](#endpoints)
<!--te-->

Installation
============

built with https://start.spring.io/

```
spring boot devtools
spring web
spring data jpa
h2 database
spring java mail
```

H2 Database
============
Console URL: http://localhost:8080/h2-console

Helpful SQL to run
```
select * from user;
```

Endpoints
============

##### Signup

URL: http://localhost:8080/signup

Action: just an endpoint that response to a request and says we're going to signup

##### Signup Success
URL: http://localhost:8080/signup-success/1

Action: The data gets loaded in the H2 Database with an id of 1, that's the id at the end of the signup-success endpoint 
