# Upgrade Hub- Hospital API

## In this project:

-At the bootcamp we were invited to make our own project in four hours. The theme i chose was an hospital.
I create 5 packages:"model","service","controller","repository","utili" and "exception". Inside the "HospitalController" i put several endpoints to perform basic CRUD operations (Get,Post,Put,Delete). 
I made two relations:
 - @OneToMany: doctors can have multiple patients
 - @ManyToMany:one patient can have several treatments

❗ first steps ❗
- Create the Spring Boot project in Spring Initialiazr.
- Then, create a new database in MySQL
- create an account in https://hub.docker.com/

## 💡Important notes:
- In order to put api running you need to install docker https://docs.docker.com/get-docker/

##  🐳 What's is Docker? 
So, Docker is an open source containerization platform. It enables developers to package applications into containers—standardized executable components combining application source code with the operating system (OS) libraries and dependencies required to run that code in any environment. 


