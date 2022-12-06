package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationComplete extends Utility {
    By registrationCompleteMessage = By.xpath("//div[@class='result']");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");

    public String getTextFromRegisterationCompleteMessage() {
        return getTextFromElement(registrationCompleteMessage);

    }


    public void clickOnTheContinueButton() {
        clickOnElement(continueTab);
    }

}
