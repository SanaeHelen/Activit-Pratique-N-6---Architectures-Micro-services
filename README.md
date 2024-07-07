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
       
          
            Après avoir exécuté l'application, nous ouvrons un navigateur et saisissons l'URL : http://localhost:8081/h2-console pour nous connecter à la base de données "account-db".
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/c95d15d4-4986-4a04-9c15-e74b7ffcb784)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/69aee1cb-bb56-48f4-99f4-d811e5dabcbf)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/f267c43a-7e1c-4c89-a6b1-7339dbc3bed7)
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/b26a0f61-ddf7-4082-ad82-7b23dd81ecc5)
          
           Nous avons observé que l'attribut "type" est stocké sous forme de valeurs binaires (0 ou 1). Pour le stocker sous forme de chaîne de caractères, nous allons ajouter l'annotation suivante dans l'entité BankAccount : @Enumerated(EnumType.STRING) au-dessus de l'attribut "type" de type AccountType.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/6f7d685a-2dd2-4acd-b579-79f4f584541c)
          
           Nous allons relancer l'exécution de l'application.
          
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/d7fcf03b-2dc5-40c8-b896-d00fe653b669)
          
            L'attribut "type" est stocké sous forme de chaîne de caractères avec les valeurs : "SAVING_ACCOUNT" ou "CURRENT_ACCOUNT".
 

        8. Creation de Micro service avec web Rest :
      

             Nous avons créé le package web dans lequel nous avons ajouté une classe Java nommée AccountRestController.

             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/72de8053-1e71-4ddf-b833-5e582fca2c07)


            Les méthodes de la classe AccountRestController permettent de récupérer tous les comptes bancaires, de récupérer un compte par son ID, de créer un nouveau compte, de mettre à jour un compte existant, et de supprimer un compte par son ID.


             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/89a2fa85-5046-4ff8-aabc-5a67e513907c)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/9e23c210-3d1c-4898-9fff-256f4f168714)
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/d203a439-64a0-4bcc-b0cb-a0d551ab8418)

           Après avoir exécuté l'application, saisissez l'URL suivante dans le navigateur : http://localhost:8081/bankAccounts pour voir la liste des comptes. REST affiche les données par défaut en format JSON, mais le client peut choisir le format (JSON ou XML) en spécifiant le format souhaité dans la requête HTTP.

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/fb2c0a60-3e92-4eba-ba73-7d45d222b28c)


            Ensuite, nous avons testé les méthodes dans Postman, un outil populaire pour tester et développer des APIs, permettant d'envoyer des requêtes HTTP et d'analyser les réponses.
            Nous avons utilisé la méthode GET pour envoyer une requête à l'URL http://localhost:8081/bankAccounts afin de récupérer tous les comptes.
     
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/a5ca6938-a1e0-4fae-ba94-0199651c9689)

            Nous avons envoyé une requête pour récupérer le compte dont l'ID est passé en paramètre à l'URL : http://localhost:8081/bankAccounts/2874d5e7-e148-4a55-83e9-ba37b8978004.

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/cb067307-5d85-4645-a945-286e3c001de1)
    
            Nous avons utilisé la requête HTTP POST à l'URL http://localhost:8081/bankAccounts pour créer et sauvegarder un nouveau compte, en envoyant les données du compte dans le corps de la requête.

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/32224b66-b78a-488e-9b0d-97fbbbb1eea5)


           Pour mettre à jour un compte, nous allons passer l'ID dans la requête : http://localhost:8081/bankAccounts/be371adf-e07a-40c2-9de7-35e9899209fb avec la méthode PUT, en modifiant l'attribut "currency" avec la valeur "MAD".

           ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/f9aaa676-7272-44fe-b009-96b4528797d6)

      
        9. La documentation avec Swagger :
        
        

            Nous avons ajouté la dépendance springdoc-openapi-ui dans le fichier pom.xml .
    
             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/32688657-697d-49cf-bd7e-7be84a8a6204)

            Nous avons accédé à la documentation Swagger via le lien suivant après l'exécution de l'application : http://localhost:8081/swagger-ui/index.html.

             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/4d0ac51f-0be5-4502-af18-eb6e029486d6)

            Nous avons accédé à la documentation de notre REST API via la requête : http://localhost:8081/v3/api-docs, ce qui génère un fichier JSON.

             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/38ca5443-2f5f-4dd8-bc04-12d43dc1a41b)

            Ce fichier JSON est une définition OpenAPI 3.0.1 pour la documentation de notre REST API. Il inclut :

            - **Informations de base** : le titre de l'API ("OpenAPI definition") et sa version ("v0").
            - **Serveur** : l'URL de base du serveur (http://localhost:8081).
            - **Endpoints** : 
              - `/bankAccounts/{id}` avec des méthodes `GET`, `PUT`, et `DELETE` pour récupérer, mettre à jour et supprimer un compte bancaire spécifique, en utilisant l'ID comme paramètre de chemin.
              - `/bankAccounts` avec des méthodes `GET` et `POST` pour récupérer tous les comptes bancaires et créer un nouveau compte.
            - **Composants** :
              - **Schémas** : la définition de l'objet `BankAccount`, qui inclut des propriétés comme `id`, `createdAt`, `balance`, `currency`, et `type`.
            
            Ce fichier décrit comment accéder et interagir avec l'API, les types de données utilisés, et les réponses attendues.


            On peut tester le web service sans utiliser Postman en utilisant Swagger UI. Par exemple, nous avons testé la méthode `bankAccount` qui retourne un compte en passant son ID comme paramètre.

              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/2130047e-cdc7-43ff-8cbe-3195b7caf187)
              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/3c0359e0-ce9c-4ece-8f77-bf1323603eea)


            Nous avons également ajouté un compte :

              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/a369013b-ccd5-48c6-b73c-7285bea8508f)
              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/9409666b-e895-4de5-a137-ace786367029)

            Le compte a été bien ajouté.

              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/57481b99-0d13-45e0-bd31-6f2a1f839d97)


             On peut également importer la documentation de l'API que nous voulons tester dans Postman. Pour ce faire, accédez à l'option "Import" dans Postman, puis saisissez le lien : http://localhost:8081/v3/api-docs.

              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/40325155-ba51-421e-896d-588d74526a5b)
              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/3893aa90-b971-40de-aac4-797a88b511d3)
              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/f5f2da8f-e713-4428-8415-fe027209eaa3)
    
             Nous avons testé la méthode `bankAccounts` avec la méthode GET pour récupérer tous les comptes.
           
              ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/2952bdfb-e049-4989-8abd-dd36098df9fb)


      10. L'utilisation de spring DATA REST :

            Nous avons ajouté la dépendance de Spring Data REST dans le fichier `pom.xml`.

             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/2fbc6113-4cda-43c1-b7e7-4db07fec2877)

            Nous avons ajouté l'annotation `@RepositoryRestResource` à l'interface `BankAccountRepository` pour démarrer un web service RESTful permettant de gérer l'entité `BankAccount`.

             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/74c0a4ce-de96-40cb-99b7-061682e5cafd)

            Dans la classe `AccountRestController`, nous avons ajouté l'annotation `@RequestMapping`.

             ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/d90425af-b5ea-4de7-aa83-261daebb61e9)

            Nous avons démarré l'application et en accédant au lien http://localhost:8081/bankAccounts, elle nous a retourné un fichier en format JSON.
            Ce fichier JSON représente une réponse typique d'une API REST qui gère des comptes bancaires (`bankAccounts`). Voici une brève explication de ses éléments :

            - `_embedded`: Contient une liste de comptes bancaires (`bankAccounts`), chaque compte étant représenté par ses attributs tels que `createdAt` (date de création), `balance` (solde), `currency` (devise), `type` (type de compte), et des liens `_links` qui pointent vers des ressources spécifiques de chaque compte.
              
            - `_links`: Contient des liens permettant de naviguer dans les résultats paginés (`self` pour la page actuelle et `profile` pour le profil de la ressource `bankAccounts`).
            
            - `page`: Contient des informations de pagination comme `size` (nombre d'éléments par page), `totalElements` (nombre total d'éléments dans la réponse), `totalPages` (nombre total de pages) et `number` (numéro de la page actuelle).
            
            En résumé, ce fichier JSON fournit une représentation structurée et paginée des comptes bancaires disponibles, facilitant ainsi la gestion et la navigation à travers ces ressources via une API RESTful.
 
            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/d82f0de2-87a5-47cd-ad17-a1442e6ee270)

           Nous avons inclus la méthode `findByType()` dans l'interface `BankAccountRepository`.

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/0f5b554b-ea9d-421a-852d-3f3162ca0802)

           Ensuite, nous avons accédé au lien http://localhost:8081/bankAccounts/search/findByType?type=SAVING_ACCOUNT pour afficher uniquement les comptes de type SAVING_ACCOUNT.

            ![image](https://github.com/SanaeHelen/Activit-Pratique-N-6---Architectures-Micro-services/assets/136022070/8b83a0bd-1839-46f3-a86a-a3c6115ff902)


         
     
     
     
                 

   


        
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
