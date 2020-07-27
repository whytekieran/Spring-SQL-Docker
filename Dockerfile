From openjdk:8
copy ./target/shortUrl-0.0.1-SNAPSHOT.jar shortUrl-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","shortUrl-0.0.1-SNAPSHOT.jar"]