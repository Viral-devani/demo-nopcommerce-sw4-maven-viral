package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartDisplayMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termsAndConditionsBox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By quantityBox = By.xpath("//input[@class='qty-input']");
    By updateShoppingCart = By.xpath("//div[@class='common-buttons']/child::button[1]");
    By totalAmount = By.xpath("//span[@class='product-subtotal']");
    By tAndCBox = By.id("termsofservice");

    public String getTextFromDisplayMessage() {
        return getTextFromElement(shoppingCartDisplayMessage);
    }


    public void clearTheQuantityField() {
        driver.findElement(quantityBox).clear();
    }
    public void updateTheQuantityField(String quantity) {
        sendTextToElement(quantityBox, quantity);
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }
    public String getTextFromAmountElement(){
        return getTextFromElement(totalAmount);
    }
    public void clickOnTermsAndConditionsAgreeBox() {
        clickOnElement(termsAndConditionsBox);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }









}
