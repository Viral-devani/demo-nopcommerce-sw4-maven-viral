package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.cssSelector("#BillingNewAddress_Email");

    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.cssSelector("#BillingNewAddress_City");
    By address1 = By.cssSelector("#BillingNewAddress_Address1");
    By zipPostalCode = By.cssSelector("#BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadio = By.id("shippingoption_1");
    By creditCardButton=By.id("paymentmethod_1");
    By continueButton1=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By continueButton2=By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");



    public void selectDataFromCountryDropDown(int index) {
        selectByIndexFromDropDown(country, index);
    }

    public void enterDataInTheCityField(String cityName) {
        sendTextToElement(city, cityName);
    }

    public void enterDataInTheAddress1Field(String add1) {
        sendTextToElement(address1, add1);
    }

    public void enterDataInTheZipPostalCodeField(String pCode) {
        sendTextToElement(zipPostalCode, pCode);
    }

    public void enterDataInTheMobileNumberField(String mobile) {
        sendTextToElement(phoneNumber, mobile);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void enterNameInTheFirstNameField(String name) {
        sendTextToElement(firstName, name);

    }

    public void enterLastNameInTheLastNameField(String lastname) {
        sendTextToElement(lastName, lastname);

    }

    public void enterRandomEmailInTheEmailField(String email) {
        sendTextToElement(emailField, email);
    }



    public void clickOnNextDayRadioButton() {
        clickOnElement(nextDayAirRadio);
    }


    public void clickOnCreditCard() {
        clickOnElement(creditCardButton);
    }
    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
}