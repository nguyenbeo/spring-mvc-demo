# spring-mvc-demo
A short demo on how Spring MVC 4 works:
* How to build up a simple webpage
* How Spring form and validation works
* Custom annotations
* Exception handler by using ControllerAdvice
* Get rid of web.xml configuration by using WebAppInitializer class instead. This is applied for servlet 3.1 or greater.

Technologies:
* Spring 4
* Spring MVC
* Spring Web
* Servlet 3.1


# How to run
mvn jetty:run-war

Open web browser and go to:

http://localhost:9999/spring-mvc-demo/changePassword

Test exception handling:

http://localhost:9999/spring-mvc-demo/testExceptionHandling