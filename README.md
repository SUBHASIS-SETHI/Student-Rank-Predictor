 #Student NEET Rank Predictor

##Project Overview :
The Student Rank Predictor is a Spring Boot-based application designed to analyze quiz performance data and predict a student's NEET rank based on their performance. It also recommends colleges that the student is likely to be admitted to based on their predicted rank.

Key Features:
1.Quiz Performance Analysis: 
-Identifies weak topics and improvement trends.
-Calculates overall accuracy and performance gaps.
2.Rank Prediction: 
-Predicts the student's NEET rank based on their quiz performance. 
3.College Recommendation: 
-Recommends colleges based on the predicted rank.

Tech Stack: 
1.Backend: Java, Spring Boot 
2.APIs: RESTful endpoints 
3.Data Fetching: External APIs (mock data used for demonstration) 4.Build Tool: Maven

##Setup Instructions Prerequisites:
1.Java Development Kit (JDK): Version 17 or higher. 
2.Maven: For building and managing dependencies. 
3.IDE: IntelliJ IDEA
4.Postman or cURL: For testing the APIs.

Steps to Run the Project:
1.Clone the Repository: -git clone (https://github.com/SUBHASIS-SETHI/Student-Rank-Predictor)
2.Build the Project: -mvn clean install 
3.Run the Application: -mvn spring-boot:run 
4.Access the Application: -The application will start on http://localhost:8080. -Use Postman or cURL to interact with the APIs.

##Approach Description

1.Data Fetching -External APIs are used to fetch quiz data and historical performance data. 
-The RestTemplate class in Spring Boot is used to make HTTP requests and parse JSON responses.
2.Data Processing :
-Quiz data is analyzed to identify weak topics, calculate overall accuracy, and determine improvement trends.
-Historical data is used to compare the student's performance with the average performance.
3.Rank Prediction:
-The student's quiz score is normalized to a percentile. 
-The predicted rank is calculated using the formula: Predicted Rank = (Total Students) * (1 - Percentile Score)
4.College Recommendation :
-Colleges are filtered based on their cutoff ranks.
-A student is eligible for a college if their predicted rank is less than or equal to the college’s cutoff rank.
