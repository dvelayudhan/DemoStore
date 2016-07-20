@Smoke @ThisRun
Feature: Checkout and complete transaction

Scenario: Checkout and complete transaction
Given I am signed in
  And I have my personal info stored in my profile
	And I have added item(s) in my cart
When I click on Checkout option
	And I click on Continue button
	And I click on Purchase button
	Then I complete the transaction 


