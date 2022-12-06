package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeToOurStorePage extends Utility {
    By welcomeToStoreMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOutLink = By.xpath("//a[contains(text(),'Log out')]");

    public String getTextFromWelcomeToStore(){
        return getTextFromElement(welcomeToStoreMessage);

    }



    public void clickOnLogOutLink(){
        clickOnElement(logOutLink);
    }
    public String verifyUrl() {
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        return actualUrl;
    }

}
