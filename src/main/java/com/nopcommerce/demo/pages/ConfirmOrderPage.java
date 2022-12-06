package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {
    By creditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethod = By.cssSelector("li[class='shipping-method'] span[class='value']");
    By totalAmount = By.xpath("//span[contains(text(),'$698.00')]");
    By totalAmountComputers = By.xpath("//span[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");




    public String getTextFromPaymentMethodText(){
        return getTextFromElement(creditCard);
    }


    public String getTextFromShippingMethodText(){
        return getTextFromElement(shippingMethod);
    }





    public String getTextFromTotalAmountComputersField(){
        return getTextFromElement(totalAmountComputers);
    }


    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
}
