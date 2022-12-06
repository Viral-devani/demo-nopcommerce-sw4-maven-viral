package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentMethodPage extends Utility {
    By creditCardRadioButton = By.id("paymentmethod_1");

    By continueButton = By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");


    public void clickOnCreditCardRadioButton(){
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
