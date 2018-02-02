# eventmanagement-api
java, spring-boot, spring-tool-suite, maven, restful-api, spring-rest-api-with-security, spring-data-jpa, spring-data-rest, microservices, hal-browser, projections, excerpts, paging-and-sorting,Crud operations

Introduction:
This project basically convers almost all the topics from the spring-boot-rest-api framework. This is a simple eventmanagement project 
that manages various events organised by the a single organiser and allowing various participants to participate in the same.

FUNCTIONALITY:
Extends CRUD repository
Extends Paging and Sorting Repository
Includes Security
  -Authentication
  -Authorisation

NOTES:
one must put username as "anmol" and password as "anmol" for USER.ROLE 
one must put username as "admin" and password as "admin" for ADMIN.ROLE
(check SecurityConfiguration.java class under main/src/com.anmol.eventmanagement/SecurityConfiguration
I have provided two seperate files that includes SQL queries for creating tables and other one for testing data when using a rest client
on the fly. I have used ARC a google chrome extention as a REST client. One can also use POSTMANT etc. as a rest client. 

