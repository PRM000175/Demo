Feature: Login 

Scenario: Successful login with valid credentials 

Given I am on the login page			
When I enter valid credentials
And I click the login button		
Then I should see the homepage