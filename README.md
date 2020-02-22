# Simple Spring Boot 2 REST service

## Description:
Spring Initializr project with:
* Actuator
* Lombok
* Web
* JPA
* H2 db

Endpoint: /api/v1/customers
Resources: 
get i.e /api/v1/customers/, /api/v1/customers/1
post {
    "firstname": "Mats",
    "lastname": "Stenson"
}
content type: application/json