FROM amazoncorretto:19-alpine-jdk
MAINTAINER proyectoapi
COPY target/portfiliocurso-0.0.1-SNAPSHOT.jar portfiliocurso-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/portfiliocurso-0.0.1-SNAPSHOT.jar"]
