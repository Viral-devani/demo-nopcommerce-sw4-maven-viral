package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentDetail extends Utility {
    By creditCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void selectCreditCardType(int index) {
        selectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon) {
        sendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr) {
        sendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        sendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}
