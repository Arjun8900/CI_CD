FROM openjdk:17-alpine
WORKDIR /opt
#EVN PORT 8090
EXPOSE 8090
#COPY target/*.jar /opt/app.jar
COPY /home/runner/work/CI_CD/CI_CD/target/archive-tmp/*.jar /opt/app.jar
#ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
ENTRYPOINT exec java $JAVA_OPTS  -cp app.jar org.example.Main
