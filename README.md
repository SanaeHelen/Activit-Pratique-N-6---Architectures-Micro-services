# Activit-Pratique-N-6---Architectures-Micro-services

Première Partie : Développer un micro-service
   - MIcro Service avec Web Service RESTFUL :
        Nous avons lancé le projet en utilisant le site : https://start.spring.io/
        ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/ad81addb-e849-4ae6-bbf8-deb9760dc29f)
        Les dépendances de ce projet incluent : Spring Web, Spring Data JPA, H2 Database, Lombok, et Spring for GraphQL.
        ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/1dcb2f59-40f6-4ddb-a6d5-3a9e9c34111e)
       Après avoir généré le projet, nous l'avons extrait et ouvert avec IntelliJ IDEA.
       ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/a64e892e-b7ff-4ed6-bc44-bfcf07faf2f5)
       On va effectuer les tâches suivantes :
           1. La création des entités :
                 - Dans le package org.sid.bank_account_service, nous avons créé le package entities.
                   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/21d1ef81-d2d1-4c81-8e13-31c05b0a2765)
                 - Nous avons créé l'entité BankAccount.
                   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/323f9620-ab72-4ec9-a0d1-31ea350a0022)
                 - Nous avons créé le package enums pour définir l'énumération AccountType, qui contiendra les différents types de comptes.
                   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/5b8106dd-8920-44e1-b1b8-b07a92ea3180)
                   ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/c373cab6-5431-4862-bc6d-462f35a7fe07)


     
     
     
                 

   


        
   - Micro-SERVICE wvec web service GRAPHQL :  
       https://www.youtube.com/watch?v=FsdR09jlqaE


     
Deuxième partie : Développer une architecture micro-service :

Objectif :
Créer une application basée sur les micro-services qui permet des gérer des clients et des comptes bancaire. chaque compte appartient à un client.
Travail à faire :
1. Créer le micro-service Discovery Service
2. Créer le micro-service Config Service
3. Créer le Micro-service Customer Service
4. Créer le micro-service Account Service
5. Créer un frontend basé sur Angular
6. Automatiser le déploiement de l'ensemble des micro-services en utilisant Docker ret Docker Compose
