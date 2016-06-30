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
  "name": "I enter valid username \"student\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter valid password \"student123\"",
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
  "duration": 7279573400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.I_navigate_to_Login_page()"
});
formatter.result({
  "duration": 1156693002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "student",
      "offset": 24
    }
  ],
  "location": "LogInPageSteps.i_enter_valid_username(String)"
});
formatter.result({
  "duration": 63479417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "student123",
      "offset": 24
    }
  ],
  "location": "LogInPageSteps.i_enter_valid_password(String)"
});
formatter.result({
  "duration": 52971573,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 49951874,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.I_am_signed_in()"
});
formatter.result({
  "duration": 2204972576,
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
  "duration": 1142682114,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_navigate_to_Products_page()"
});
formatter.result({
  "duration": 2470031537,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.i_can_see_a_list_of_Products()"
});
formatter.result({
  "duration": 38841693,
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
  "duration": 1254362205,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_navigate_to_Products_page()"
});
formatter.result({
  "duration": 6009104319,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.i_click_on_item_name_to_see_details()"
});
formatter.result({
  "duration": 2718201678,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPageSteps.i_can_see_the_product_Details()"
});
formatter.result({
  "duration": 41871655,
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
    },
    {
      "line": 1,
      "name": "@ThisRun"
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
  "duration": 1373807556,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_navigate_to_Products_page()"
});
formatter.result({
  "duration": 2296571913,
  "status": "passed"
});
formatter.match({
  "location": "ProductsPageSteps.i_click_on_item_name_to_see_details()"
});
formatter.result({
  "duration": 3332712395,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPageSteps.i_click_on_Add_To_Cart_option()"
});
formatter.result({
  "duration": 58308885,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPageSteps.i_can_see_the_success_message()"
});
formatter.result({
  "duration": 3754881311,
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
  "duration": 55010150,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_Checkout_option()"
});
formatter.result({
  "duration": 1714305095,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_can_see_the_item_s_in_my_cart()"
});
formatter.result({
  "duration": 132609183,
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
  "duration": 46353253,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.i_have_my_personal_info_stored_in_my_profile()"
});
formatter.result({
  "duration": 3847678585,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_have_added_item_s_in_my_cart()"
});
formatter.result({
  "duration": 69258058,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_Checkout_option()"
});
formatter.result({
  "duration": 41191060,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_click_on_Continue_button()"
});
formatter.result({
  "duration": 1729925420,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_can_see_my_info_autopopulated()"
});
formatter.result({
  "duration": 1255071025,
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
    },
    {
      "line": 1,
      "name": "@ThisRun"
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
  "duration": 57467604,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.i_have_my_personal_info_stored_in_my_profile()"
});
formatter.result({
  "duration": 3499783345,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_have_added_item_s_in_my_cart()"
});
formatter.result({
  "duration": 70859156,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_Checkout_option()"
});
formatter.result({
  "duration": 2215099070,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_click_on_Continue_button()"
});
formatter.result({
  "duration": 158270686,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutPageSteps.i_click_on_Purchase_button()"
});
formatter.result({
  "duration": 5095591818,
  "status": "passed"
});
formatter.match({
  "location": "TransactionResultsPageSteps.i_complete_the_transaction()"
});
formatter.result({
  "duration": 185187217,
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
  "duration": 41840543,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.i_click_on_LogOut()"
});
formatter.result({
  "duration": 49201360,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_go_to_LoginPage()"
});
formatter.result({
  "duration": 46369932,
  "status": "passed"
});
formatter.after({
  "duration": 966497865,
  "status": "passed"
});
});