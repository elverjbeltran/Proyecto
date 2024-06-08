FROM openjdk:17 
COPY "./target/ProyecFinalGrado-1.jar.jar" "app.jar"
EXPOSE 8013
ENTRYPOINT [ "java","-jar","app.jar" ]


##https://github.com/katerinbaez/FutbolSpring.git

