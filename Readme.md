# RentalService - Dockerisation

## Objectif
Dockeriser une application Java (Gradle) et l’exécuter via Docker.

---

## Récupération du projet
```bash
mkdir projects
cd projects
git clone https://github.com/charroux/ingnum.git
cd ingnum

Creation du depot Git personnel

git remote set-url origin https://github.com/nathanbch/rentalservice-docker.git
git branch -M main
git push -u origin main

Build du projet Docker 

java -jar build/libs/RentalService-0.0.1-SNAPSHOT.jar

Accès via navigateur : 

http://localhost:8080/bonjour

Création du Dockerfile

FROM eclipse-temurin:21

VOLUME /tmp

EXPOSE 8080

ADD build/libs/RentalService-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

Build de l'image Docker 

docker build -t rentalservice .

Exécution avec Docker 

docker run -p 8080:8080 rentalservice

Accès via navigateur : 

http://localhost:8080/bonjour

Commandes Git Finales 

git add Dockerfile README.md
git commit -m "Dockerisation de l'application RentalService"
git push


