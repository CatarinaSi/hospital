FROM openjdk:latest
ADD target/hospital-1.0-SNAPSHOT.jar hospital.jar
#EXPOSE 8088
ENTRYPOINT ["java","-jar","hospital.jar"]