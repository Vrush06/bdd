Feature: To test login functinality
Scenario: Verify user is login succesful with valid data
Given Browser is open
And User is on login page
When User enter valid un and pwd
And click on login btn
Then user should naviagate to Home page