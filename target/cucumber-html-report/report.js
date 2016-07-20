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
  "duration": 16086871143,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.I_navigate_to_Login_page()"
});
formatter.result({
  "duration": 5229991584,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_enter_valid_username()"
});
formatter.result({
  "duration": 146249166,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_enter_valid_password()"
});
formatter.result({
  "duration": 119776065,
  "status": "passed"
});
formatter.match({
  "location": "LogInPageSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 127962881,
  "status": "passed"
});
formatter.match({
  "location": "MyHomePageSteps.I_am_signed_in()"
});
formatter.result({
  "duration": 10499681752,
  "status": "passed"
});
});