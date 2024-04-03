FROM openjdk:17-alpine
EXPOSE 8085
ADD target/devops-project.jar devops-project.jar
ENTRYPOINT ["java", "-jar", "/devops-project.jar"]
