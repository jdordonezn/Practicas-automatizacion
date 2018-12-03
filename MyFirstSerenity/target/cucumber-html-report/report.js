$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/loginSerenity.feature");
formatter.feature({
  "name": "Login in newtours page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login in newtours",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The newtours login page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.the_newtours_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the user and password",
  "keyword": "When "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.i_fill_the_user_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I access to a new page",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursLoginStepDefinitions.i_access_to_a_new_page()"
});
formatter.result({
  "status": "passed"
});
});