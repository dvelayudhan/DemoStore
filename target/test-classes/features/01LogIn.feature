@Smoke @SetUp @ThisRun @Log
Feature: LoginAction

Scenario: Successful Login with valid credentials
Given I load the website url
 When I navigate to Login page
	And I enter valid username
	And I enter valid password
	And I click on Login button
 Then I am signed in