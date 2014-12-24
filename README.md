# Fulfillment Center One Service

## Installation Overview

This is the REST service for fulfillment center one in my Pluralsight Apache Camel course. The project was built using a Maven archetype for Jersey. The project was built with the following:

..* Implemented on Windows 8.1, 64-bit
..* Eclipse
..* JDK 1.7.0_45
..* Maven 3
..* Jersey 2.14

## Component Installation

To install the project, you will need to have Maven 2+ installed and configured. Once you have installed Maven, follow these steps:

1. Open a command window and navigate to the root directory of the project. 
2. Run the command: mvn install

## Running the Project

Once you have successfully built the project, simply open a command prompt and run the following command from the root directory of the project: mvn exec:java

This will start the server and allow you to call the web service for order fulfillment. The URL is: 

http://localhost:8090/services/orderFulfillment/processOrders

If you would like to test the service directly, you can use a plug-in to Firefox called Poster. Use the URL above, the content type as application/json and the following body:

{"orders":[
	{"firstName":"Tester","lastName":"Test","email":"test@test.com","orderNumber":"1234","timeOrderPlaced":"Dec 23, 2014 5:38:03 PM","orderItems":[
		{"itemNumber":"1234","price":12.3300000000000000710542735760100185871124267578125,"quantity":5}
	]}
]}

If the service call was successful, you should see the order information output to the command window and you should get a 200 for the response. 
