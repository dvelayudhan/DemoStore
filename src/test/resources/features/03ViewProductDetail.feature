@Smoke
Feature: View Product Details as a signed in user

Scenario: View Product Details
Given I am on Home page
When I navigate to Products page
And I click on item name to see details
Then I can see the product Details