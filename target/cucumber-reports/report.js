$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/login.feature");
formatter.feature({
  "name": "Login Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Getir basket test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user open the getir application and enters \"hello@getir.com\" and \"hello\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.the_user_open_the_getir_application_and_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.the_user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verify that basket is empty and able to see \"There is no result\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.the_user_verify_that_basket_is_empty_and_able_to_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user able to see all menu list in console and verify that ise size is 12",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.theUserAbleToSeeAllMenuListInConsoleAndVerifyThatIseSizeIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks second category which is \"Atıştırmalık\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.the_user_clicks_second_category_which_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user add two items",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.theUserAddTwoItems()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user scroll down to \"Ürün 13\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.theUserScrollDownTo(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user add two items",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.theUserAddTwoItems()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user go to basket",
  "keyword": "And "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.theUserGoToBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user verify that \"Total Amount : 84 ₺\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.getir.step_definitions.LoginStepDef.theUserVerifyThat(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});