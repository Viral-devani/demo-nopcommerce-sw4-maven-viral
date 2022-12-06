package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class signInPage extends Utility {
    By signInPageWelcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registerTab = By.xpath("//button[contains(text(),'Register')]");
    By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");


    public String getTextFromWelcomeMessage() {
        return getTextFromElement(signInPageWelcomeMessage);

    }


    public void clickOnRegisterTab() {
        clickOnElement(registerTab);
    }

    public void clickOnCheckOutAsAGuestTab() {
        clickOnElement(checkOutAsGuest);
    }

}
