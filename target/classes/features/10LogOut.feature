@Smoke @Log @Teardown
Feature: Logout of the website

Scenario: Logout of the website
Given I am signed in
When I click on LogOut
Then I go to LoginPage