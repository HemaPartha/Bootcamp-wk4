FROM java:8
WORKDIR /myApp
ADD target/scala-2.12/bootcamp-wk4_2.12-0.1.jar bootcamp-wk4-1.0.0-SNAPSHOT.jar
ENV AKKA_HTTP_SAMPLE_PORT 1234
EXPOSE 1234
CMD java -jar bootcamp-wk4-1.0.0-SNAPSHOT.jar 0.0.0.0