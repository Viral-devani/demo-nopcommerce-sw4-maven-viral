package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutFinalPage extends Utility {
    By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");
    By successfulOrderMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");

    public String getTextFromThankYouMessage() {
        return getTextFromElement(thankYouMessage);
    }


    public String getTextFromOrderProcessedSuccessfullyMessage() {
        return getTextFromElement(successfulOrderMessage);
    }


    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}
