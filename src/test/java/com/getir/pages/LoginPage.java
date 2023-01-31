package com.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@text='username']")
    public AndroidElement usernameInput;

    @FindBy(xpath = "//*[@text='password']")
    public AndroidElement passwordInput;

    @FindBy(xpath = "//*[@text='Submit']")
    public AndroidElement submit;

    @FindBy(xpath = "//*[@text='Dondurma']")
    public AndroidElement iceCream;

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton")
    public AndroidElement basket;

    @FindBy(className = "android.widget.TextView")
    public List<AndroidElement> menuList;

    @FindBy(xpath = "//*[@text='There is no result']")
    public AndroidElement basketText;

    public void login(String username,String password){
        waitUntil(usernameInput).sendKeys(username);
        waitUntil(passwordInput).sendKeys(password);
        submit.click();
    }
    public AndroidElement waitUntil(AndroidElement element){
        return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static List<String> getElementText(List<AndroidElement> elements){
        List<String> elementText = new ArrayList<>();
        for (AndroidElement elem : elements) {
            elementText.add(elem.getText());
        }
        return elementText;
    }


}
