@Smoke @ThisRun
Feature: View Checkout Info
	
Scenario: View Checkout Info
Given I am signed in
  And I have my personal info stored in my profile
	And I have added item(s) in my cart
When I click on Checkout option
	And I click on Continue button
Then I can see my info autopopulated