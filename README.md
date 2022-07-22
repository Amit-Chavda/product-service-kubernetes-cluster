# Product-Microservices
This repository conatains all modules to create a product service.

- ### ProServiceConfigServer
This module is used as a configuration server.

- ### ProductCategoryService
This module is a rest api for product category details. It uses MySQL database.

- ### ProductInvenotryService
This module is a rest api for product inventory detalis. It uses MySQL database.
 
- ### ProductService
This module is rest api which uses above two modules to get product details. It uses MongoDB database.

- ### ProductServiceDescoveryService
This module provides registry service for other microservices. 

- ### ProductServiceGateway
This modules acts as an interface between outside world and all microservices.

## Configuaration
To run this project, you can follow steps given hereby:

#### 1.  Download all modules and import in IntelliJ or Eclise IDE.
#### 2.  Create .jar file of each project.
#### 3.  Generate docker image using docker build command
#### 4.  Locate docker-compose.yml file and run it using doekcer-compose up command.


## Microservice Architecture
<br/>![Product Service Architecture](https://user-images.githubusercontent.com/47694676/175242948-f71fd196-4b3a-40b9-a0a1-fae944b1b1a2.png)


## Kubernets Cluster
<br/>![product-service-kubernetes-cluster drawio (1)](https://user-images.githubusercontent.com/47694676/179526860-a008e574-284d-4c93-a035-7521cbcc5c93.png)
Zoom a bit for clearity!


## Tools and Technologies used
* Spring boot
* Spring cloud
* Docker
* Kubernetes
