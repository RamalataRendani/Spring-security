# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.2/maven-plugin/reference/html/#build-image)


* Spring Boot Token based Authentication with Spring Security and JWT.
* JWT - JSON Web Token
  * Appropriate Flow for User signup and user sign in with JWT token
  * Spring Boot Application Architecture with Spring Security
  * How to configure Spring Security to work with JWT
  * How to define Data models and association for Authentication and Authorisation
  * Way to use Spring Data JPA to interact with MySQL Database
*User can sign up new account and sign in with username and password
* By user roles( admin, moderator, user) , authorize the user to access resources
* Postman to test the API

*Registration Process
*Client - 1 User registration (username, email, role(s), password)
*Server - 2 a. check existing b. save User into the Database
*Client - 3. return Message ("Sign up Successfully)

* User login/ authentication
* Client - 1 . Post request (username password)
* Server - 2 .Authenticate (username, password) Create a JWT string with a secret
* Client - 3 JWTResponse{ token, type/roles, user details, authorities}


* Resource Access
* Client - 1 . Request data with JWT on Authorisation Header
* Server - 2 . Check JWT signature. Get user details and authenticate, authorise using the authorities
* Client - 3. Return Response based on Authorities

* Technology
* Java
* Spring Boot(Spring Scurity, Spring web, Spring Data JPA)
* jjwt
* MySQL
* Maven
* 

* Spring Security
* WebSecurityConfigurerAdaptor - It provides HttpSecurity Configurations to configure cors,csrf, session management,
* rules for protected resources
* UserDetailsService - method to load User by username and returns a userDetails objects that spring security can use
* for authentication and validation
* UserDetails - contain necessary information(username, password, authorities)
* UsernamePasswordAuthenticationToken - gets {username, password)} from a login request, Authntication Manager will use
* the UsernamePaswordAuthentication to authenticate a login account
* Authentication Manager has a AOAuthenticationProvider( with the help of UserDetailsService & Password Encoder) to validate
* UsernamePasswordAuthenticationToken object. if successfully, Authentication Manager returns a fully populated
* Authentication object( including granted authorities)
* A Legal JWT must be added to the HTTP Authorisation Header if the Client protected resources.

*Models
*ERole.java
 * public enum ERole{
 * ROLE_USER,
 * ROLE_MODERATOR,
 * ROLE_ADMIN
 * }

 * Role
   * Long id
   * ERole name
   

 * User
 * id
 * username
 * email
 * password
 * Set<Roles> roles = new HashSet<>()

