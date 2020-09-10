FROM java:8


COPY ./target/scala-2.12/bootcamp-wk4_2.12-0.1.jar ./myApp/bootcamp-0.1.jar
WORKDIR /myApp

EXPOSE 1234
CMD ["java" , "-jar", "bootcamp-0.1.jar"]
