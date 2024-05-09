# SpringTokenViewer



## Spring Boot 2.7.18
### Spring Web
### Spring OAuth2 Client

## Version 1
### @RegisteredOAuth2AuthorizedClient
### OAuth2AuthorizedClient
### http://localhost:8080/token

### pom.xml
okta-spring-boot-starter include spring-boot-starter-oauth2-client, keep only one.

### error
"The authorization server resource does not have any configured default scopes, 'scope' must be provided." <br>
Add - spring.security.oauth2.client.registration.okta.scope=openid,email,profile



## Reference
### JWT Decode
https://jwt.io/

### Spring Boot Remote vs Local tokens
https://developer.okta.com/blog/2020/08/07/spring-boot-remote-vs-local-tokens
