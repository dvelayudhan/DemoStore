$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01LogIn.feature");
formatter.feature({
  "line": 2,
  "name": "LoginAction",
  "description": "",
  "id": "loginaction",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@SetUp"
    },
    {
      "line": 1,
      "name": "@ThisRun"
    },
    {
      "line": 1,
      "name": "@Log"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with valid credentials",
  "description": "",
  "id": "loginaction;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I load the website url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am signed in",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingSteps.i_load_the_website_url()"
});
formatter.result({
  "duration": 14587678622,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.I_navigate_to_Login_page()"
});
formatter.result({
  "duration": 5662155929,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_enter_valid_username()"
});
formatter.result({
  "duration": 168521571,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_enter_valid_password()"
});
formatter.result({
  "duration": 146113645,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 123879185,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.I_am_signed_in()"
});
formatter.result({
  "duration": 13983023299,
  "status": "passed"
});
formatter.uri("02ViewProductsPage.feature");
formatter.feature({
  "line": 2,
  "name": "View Products page as a signed in user",
  "description": "",
  "id": "view-products-page-as-a-signed-in-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "View Products page",
  "description": "",
  "id": "view-products-page-as-a-signed-in-user;view-products-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Products page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I can see a list of Products",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.i_am_on_homepage()"
});
formatter.result({
  "duration": 20576587,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_navigate_to_Products_page()"
});
formatter.result({
  "duration": 3027940792,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.i_can_see_a_list_of_Products()"
});
formatter.result({
  "duration": 2634590530,
  "status": "passed"
});
formatter.uri("03ViewProductDetail.feature");
formatter.feature({
  "line": 2,
  "name": "View Product Details as a signed in user",
  "description": "",
  "id": "view-product-details-as-a-signed-in-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "View Product Details",
  "description": "",
  "id": "view-product-details-as-a-signed-in-user;view-product-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Products page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on item name to see details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I can see the product Details",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.i_am_on_homepage()"
});
formatter.result({
  "duration": 29413903,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_navigate_to_Products_page()"
});
formatter.result({
  "duration": 4640805970,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.i_click_on_item_name_to_see_details()"
});
formatter.result({
  "duration": 3573972492,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPageSteps.i_can_see_the_product_Details()"
});
formatter.result({
  "duration": 4446356091,
  "status": "passed"
});
formatter.uri("04AddToCart.feature");
formatter.feature({
  "line": 2,
  "name": "Add an item to Cart as a signin user",
  "description": "",
  "id": "add-an-item-to-cart-as-a-signin-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Add an item to cart",
  "description": "",
  "id": "add-an-item-to-cart-as-a-signin-user;add-an-item-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Products page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on item name to see details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Add To Cart option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I can see the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.i_am_on_homepage()"
});
formatter.result({
  "duration": 13480262,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_navigate_to_Products_page()"
});
formatter.result({
  "duration": 3790408374,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.i_click_on_item_name_to_see_details()"
});
formatter.result({
  "duration": 5810276187,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPageSteps.i_click_on_Add_To_Cart_option()"
});
formatter.result({
  "duration": 176840746,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPageSteps.i_can_see_the_success_message()"
});
formatter.result({
  "duration": 4382418244,
  "status": "passed"
});
formatter.uri("05ViewCheckoutYourCart.feature");
formatter.feature({
  "line": 3,
  "name": "View checkout item in shopping cart",
  "description": "",
  "id": "view-checkout-item-in-shopping-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "View checkout item",
  "description": "",
  "id": "view-checkout-item-in-shopping-cart;view-checkout-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I have added item(s) in my cart",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Checkout option",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the item(s) in my cart",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.i_have_added_item_s_in_my_cart()"
});
formatter.result({
  "duration": 98753615,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_Checkout_option()"
});
formatter.result({
  "duration": 3518724243,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_can_see_the_item_s_in_my_cart()"
});
formatter.result({
  "duration": 3416553243,
  "status": "passed"
});
formatter.uri("06ViewCheckoutInfo.feature");
formatter.feature({
  "line": 2,
  "name": "View Checkout Info",
  "description": "",
  "id": "view-checkout-info",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "View Checkout Info",
  "description": "",
  "id": "view-checkout-info;view-checkout-info",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am signed in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have my personal info stored in my profile",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I have added item(s) in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Checkout option",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can see my info autopopulated",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.I_am_signed_in()"
});
formatter.result({
  "duration": 2333625305,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.i_have_my_personal_info_stored_in_my_profile()"
});
formatter.result({
  "duration": 5009467037,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_have_added_item_s_in_my_cart()"
});
formatter.result({
  "duration": 108135274,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_Checkout_option()"
});
formatter.result({
  "duration": 2681374145,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_click_on_Continue_button()"
});
formatter.result({
  "duration": 714958930,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_can_see_my_info_autopopulated()"
});
formatter.result({
  "duration": 4445183385,
  "status": "passed"
});
formatter.uri("07CompleteTransaction.feature");
formatter.feature({
  "line": 2,
  "name": "Checkout and complete transaction",
  "description": "",
  "id": "checkout-and-complete-transaction",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Checkout and complete transaction",
  "description": "",
  "id": "checkout-and-complete-transaction;checkout-and-complete-transaction",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am signed in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have my personal info stored in my profile",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I have added item(s) in my cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Checkout option",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Purchase button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I complete the transaction",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.I_am_signed_in()"
});
formatter.result({
  "duration": 3478477703,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.i_have_my_personal_info_stored_in_my_profile()"
});
formatter.result({
  "duration": 4698179638,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_have_added_item_s_in_my_cart()"
});
formatter.result({
  "duration": 73366036,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_Checkout_option()"
});
formatter.result({
  "duration": 2202204382,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_click_on_Continue_button()"
});
formatter.result({
  "duration": 442276462,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_click_on_Purchase_button()"
});
formatter.result({
  "duration": 5122786436,
  "status": "passed"
});
formatter.match({
  "location": "TransactionResultsPageSteps.i_complete_the_transaction()"
});
formatter.result({
  "duration": 2639691084,
  "status": "passed"
});
formatter.uri("10LogOut.feature");
formatter.feature({
  "line": 2,
  "name": "Logout of the website",
  "description": "",
  "id": "logout-of-the-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@Log"
    },
    {
      "line": 1,
      "name": "@Teardown"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Logout of the website",
  "description": "",
  "id": "logout-of-the-website;logout-of-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am signed in",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on LogOut",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I go to LoginPage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyHomePageSteps.I_am_signed_in()"
});
formatter.result({
  "duration": 2719539988,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_LogOut()"
});
formatter.result({
  "duration": 115608798,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_go_to_LoginPage()"
});
formatter.result({
  "duration": 125194190,
  "status": "passed"
});
formatter.after({
  "duration": 1098318592,
  "status": "passed"
});
});