# restful-prime-calculator
--------------------------
A RESTful service that calculates prime numbers - it show cases two algorithm to calculate prime numbers:
1) Trial division
2) Sieve of Eratosthenes

It is delivered as a maven based spring-boot application that serves RESTful webservice access to the calculator. The response
is a JSON string of the format:
request: http://localhost:8080/primes/sieve/5
response: {"number":5,"primes":[2,3]}

The calculator calculates and returns all prime numbers less than the entered number. For e.g. in the above example,
it will calculate and return all prime numbers less than 5.

How to Clone
------------
Hosted on public github
git clone https://github.com/rajivminhas/restful-prime-calculator.git

How to build
------------
Run maven task 'install' to build, execute tests and create jar.

Running the app and testing the web service
-------------------------------------------
Run the class - com.icap.restful.prime.calculator.App (right click and run as application in your favourite IDE)
Once the spring boot application has started, open browser and test the service

a) Test the Trial division algorithm:
Enter the foll. url in the browser: http://localhost:8080/primes/division/20
The response: should be: {"number":20,"primes":[2,3,5,7,11,13,17,19]}

b) Test the Sieve of Eratosthenes algorithm:
enter the foll. url: http://localhost:8080/primes/sieve/20
the response should be: {"number":20,"primes":[2,3,5,7,11,13,17,19]}

