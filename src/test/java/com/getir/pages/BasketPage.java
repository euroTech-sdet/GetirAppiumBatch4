package com.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{


    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView")
    public AndroidElement backButton;

    @FindBy(id = "com.getir.casestudy.dev:id/btnAdd")
    public AndroidElement addItems;

    @FindBy(id = "com.getir.casestudy.dev:id/tvTotalTitle")
    public AndroidElement resultText;


    public void getCategory(String categoryName){
        driver.findElement(By.xpath("//*[@text='"+categoryName+"']")).click();
    }
}
