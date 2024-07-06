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



       3. L'utilisation de Spring Data JPA :
          
             Nous avons créé un nouveau package, repositories, qui contient l'interface BankAccountRepository, héritant de l'interface JpaRepository.
     
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/b32465d6-c639-42d8-aeac-2585b1946a9b)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/0547fad3-6eed-4d1e-a0f4-957098f8fd0b)


       5. L'enregistrement des comptes bancaire dans la base de données  :
          
             Nous avons défini dans la classe BankAccountServiceApplication.java une méthode qui, au démarrage, crée et enregistre 10 comptes bancaires aléatoires dans le repository BankAccountRepository.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/28c8eb67-52ce-4b67-ad54-ba0863735b1b)
          
             Dans le fichier application.properties, nous avons configuré une base de données H2 en mémoire nommée "account-db", activé la console H2, et spécifié le port d'écoute à 8081 pour l'application Spring Boot.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/4e2b914b-b6d0-436d-acc6-70cadc6478b7)


       7. L'exécution de l'application
    
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/c95d15d4-4986-4a04-9c15-e74b7ffcb784)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/69aee1cb-bb56-48f4-99f4-d811e5dabcbf)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/f267c43a-7e1c-4c89-a6b1-7339dbc3bed7)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/b26a0f61-ddf7-4082-ad82-7b23dd81ecc5)
          
           Nous avons observé que l'attribut "type" est stocké sous forme de valeurs binaires (0 ou 1). Pour le stocker sous forme de chaîne de caractères, nous allons ajouter l'annotation suivante dans l'entité BankAccount : @Enumerated(EnumType.STRING) au-dessus de l'attribut "type" de type AccountType.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/6f7d685a-2dd2-4acd-b579-79f4f584541c)
          
           Nous allons relancer l'exécution de l'application.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/d7fcf03b-2dc5-40c8-b896-d00fe653b669)
          
            L'attribut "type" est stocké sous forme de chaîne de caractères avec les valeurs : "SAVING_ACCOUNT" ou "CURRENT_ACCOUNT".
 
                
           
               

     











     
     
     
                 

   


        
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
