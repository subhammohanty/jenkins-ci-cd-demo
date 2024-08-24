FROM openjdk:17
WORKDIR /appContainer
COPY ./target/jenkinsCiCd.jar /appContainer
EXPOSE 8082
CMD ["java", "-jar", "jenkinsCiCd.jar"]