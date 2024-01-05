
<h1>Kirna Store</h1>
<h3>Aim - Develop a backend service designed to empower Kirana stores in managing their transaction registers. This service aims to facilitate the daily tracking of all credit and debit
 transactions, providing a comprehensive solution for effective financial record-keeping.</h3>
<h3>Tech Stack Used:- </h3> Spring Boot, RestApi, MySQL, Spring JPA

<h3>Project Structure:-</h3>
 
KiranaStoreService
1. Controller  ->  KiranaStoreApiController
2. Model  - KiranaStore
3. Repository  - KiranaStoreRepository
4. Service - impl(implementation) - KiranaStoreServiceImpl
              - KiranaStoreService
5. KiranaStoreServiceApplication( Starting Point of Application)


<h3>APIS:-</h3>
I have Created Below Api which are required as per Assessment Details- 

1. <b>AddTransaction</b>(POST) - 

  Url - http://localhost:8080/kiranstore

  Body - {
     "username": "Anurag",
     "transactionType": "Debit",
     "amountType": "USD",
     "amount":781.009
     }  

2. Get ALL Transaction (GET) -

    url -http://localhost:8080/kiranstore
  
3. Get Transaction By Transaction ID (GET) - 
 
   url - http://localhost:8080/kiranstore/:id

   example -http://localhost:8080/kiranstore/1

4. Update Transaction Details (PUT) -
 
  url -http://localhost:8080/kiranstore
   Body- {
       "username": "Deepa",
       "transactionType": "Debit",
       "amountType": "USD",
       "amount":1.009,
       "id":1,
       "date":"2024-01-02"
       }

5. Delete Transaction (DELETE) -

  url - http://localhost:8080/kiranstore/:id

  example - http://localhost:8080/kiranstore/1


6. Get All Transaction list on a Specific Date (GET)- 

   url - http://localhost:8080/kiranstore/byDate?date=

   example - http://localhost:8080/kiranstore/byDate?date=2024-01-03


Note- 1. ID is the primary key and it is auto-incremented.
      2. Transaction Date is the date on which the transaction is created
      
How to Run the Project- 

1. Open the Folder in IntelliJ Idea.
2. Created a Kirana_store empty schema in MySql WorkBench.
3. Enter your Username and Password in the application.yaml file.
4. Run the KiranaStoreServiceApplication file.
5. Run the Above APIs in the postman and View working in MySql WorkBench.



DataBase Sample - 


