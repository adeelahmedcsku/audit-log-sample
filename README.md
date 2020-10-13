# spring-boot-audit-log
Audit Logging in Spring Boot JPA

1. install the gradle
brew install gradle  

2. ./gradlew build

3. gradle task to run the project 
build bootRun

4. Mysql data base service should be on.

5. open the postman and make the following request

http://localhost:8080/student/save

Json object to be send in body.
{
	"firstName" : "adeel",
	"lastName": "tst",
	"emailAddress" : "test@gmail.com",
    "phoneNumber":"034455555676"
}

now open the data base and select the audit table to view the content of the audit trail.
