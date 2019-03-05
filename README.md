# spring-boot-user
Spring Boot user login and registration module with JWT Authentication
# ---------------------------------------------------------------------------------------------------------------------------------------------

# User Module
Register :
API Endpoint : "base_url"/register
Request Method : POST
POST Body :
          {
            "firstName": "Tyrion", 
            "lastName": "Lannister", 
            "email": "tyrion.casterly_rock@got.com", 
            "password": "handofthequeen", 
            "username": "tyrion_lannister"
          }
(username should be unique)

Response :
Successful Registration : 200 OK
Registration Failure : 500 Server Error (in case of user existed with same username)

# ---------------------------------------------------------------------------------------------------------------------------------------------

Login :
API Endpoint : "base_url"/login
Request Method : POST
POST Body :
          { 
             "username": "tyrion_lannister", 
             "password": "handofthequeen"
          }
Response :
Successful Login : 200 OK with JWT Token as "Authorization" header.
Login Failure : 403 Unauthorized

