package com.getir.step_definitions;

import com.getir.pages.BasePage;
import com.getir.pages.BasketPage;
import com.getir.pages.LoginPage;
import com.getir.utilities.ScrollHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    BasketPage basketPage = new BasketPage();

    @Given("The user open the getir application and enters {string} and {string}")
    public void the_user_open_the_getir_application_and_enters_and(String username, String password) throws InterruptedException {

        loginPage.login(username, password);
        Thread.sleep(2000);
    }

    @Then("The user login successfully")
    public void the_user_login_successfully() {
        String actualText = loginPage.iceCream.getText();
        Assert.assertEquals("Dondurma",actualText);


    }
    @Then("The user verify that basket is empty and able to see {string}")
    public void the_user_verify_that_basket_is_empty_and_able_to_see(String expectedText) {
        loginPage.basket.click();
        loginPage.waitUntil(loginPage.basketText);
        String actualText=loginPage.basketText.getText();
        Assert.assertEquals(expectedText,actualText);
        basketPage.backButton.click();

    }

    @And("The user able to see all menu list in console and verify that ise size is {int}")
    public void theUserAbleToSeeAllMenuListInConsoleAndVerifyThatIseSizeIs(int expectedSize) {

        int actualSize = loginPage.menuList.size();
        System.out.println(LoginPage.getElementText(loginPage.menuList));
        System.out.println("actualSize = " + actualSize);
        Assert.assertEquals(expectedSize,actualSize);


    }

    @Then("The user clicks second category which is {string}")
    public void the_user_clicks_second_category_which_is(String categoryName) {
        basketPage.getCategory(categoryName);
    }


    @And("The user add two items")
    public void theUserAddTwoItems() {
        basketPage.addItems.click();
        basketPage.addItems.click();
    }

    @And("The user scroll down to {string}")
    public void theUserScrollDownTo(String itemText) {

        new ScrollHelper().scrollVerticalHelper(itemText);
    }

    @And("The user go to basket")
    public void theUserGoToBasket() {

        loginPage.basket.click();
    }

    @Then("The user verify that {string}")
    public void theUserVerifyThat(String expectedResult) {

        String actualResult= basketPage.resultText.getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }
}
