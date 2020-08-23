# DWP Technical Assessment
[Click Here](https://dwp-technical-test.herokuapp.com/swagger-ui.html#/) to be taken the deployed application which is hosted on heroku.

 ## Prerequisites
 - Java JDK 13
 - Gradle
 
 ## System architecture outline
The application uses port 8080, and uses Spring Boot, SpingFox Swagger, Junit 5, Lombok and  OpenFeign for communication with https://dwp-techtest.herokuapp.com/ api. 

## Endpoints
- ```http://localhost:8080/``` or ```https://dwp-technical-test.herokuapp.com/``` Swagger Endpoint 
- ```http://localhost:8080/api/users``` or ```https://dwp-technical-test.herokuapp.com/api/users``` gets all the users
- ```http://localhost:8080/api/user/{id}``` or ```https://dwp-technical-test.herokuapp.com/api/user/{id}``` get user by id (replace {id} with user Id, for example:```http://localhost:8080/api/user/1``` )
- ```http://localhost:8080/api/london/users``` or ```https://dwp-technical-test.herokuapp.com/api/london/users``` get all users that live in london
- ```http://localhost:8080/api/london/users/distance/{distance}``` or ```https://dwp-technical-test.herokuapp.com/api/london/users/distance/{distance}``` get the Users that are in specified distance from centre of London (replace {distance} with the  distance value is in miles, for example: ```http://localhost:8080/api/london/users/distance/60``` )


## How to run the application locally
### To run this application without an IDE.
1. Open Terminal or Command Line/ PowerShell.
2. Navigate to the location where the project has been download or cloned.
3. Run `./gradlew clean bootrun` which would run the project.
4. Go to your web browser and type in localhost:8080 or [click here](http://localhost:8080) you would be introduced to a swagger documentation outlining the endpoint and the request and response body to use the API.