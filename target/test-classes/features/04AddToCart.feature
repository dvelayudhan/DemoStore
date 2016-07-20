@Smoke
Feature: Add an item to Cart as a signin user

Scenario: Add an item to cart
Given I am on Home page
When I navigate to Products page
And I click on item name to see details
And I click on Add To Cart option
Then I can see the success message