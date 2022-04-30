FROM adoptopenjdk/openjdk8
COPY *.jar /cicd-code-demo.jar

CMD ["--server.port=8088"]

EXPOSE 8088

ENTRYPOINT ["java","-jar","/cicd-code-demo.jar"]