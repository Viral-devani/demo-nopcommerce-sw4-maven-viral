package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility {
    By registerMessage = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By randomEmail = By.cssSelector("#Email");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");


    public String getTextFromRegisterMessage() {
        return getTextFromElement(registerMessage);
    }


    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
    }

    public void enterEmail(String email) {
        sendTextToElement(randomEmail, getAlphaNumericString(4));
    }

    public void enterPassword(String pWord) {
        sendTextToElement(password, pWord);
    }

    public void enterConfirmPassword(String cPWord) {
        sendTextToElement(confirmPassword, cPWord);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }
}

