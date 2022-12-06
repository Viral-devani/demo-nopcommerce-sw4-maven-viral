package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By buildYourOwnComputerMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.id("product_attribute_2");
    By hdd = By.id("product_attribute_3_7");
    By os = By.id("product_attribute_4_9");
    By softwareBox2 = By.id("product_attribute_5_12");
    By actualTotal = By.xpath("//span[@id='price-value-1']");
    By addToCartButton = By.id("add-to-cart-button-1");
    By productAddedMessage = By.xpath("//p[text()='The product has been added to your ']");
    By closingBarButton = By.xpath("//span[@title='Close']");
    By shoppingCartOption = By.cssSelector(".cart-label");
    By goToCartButton = By.cssSelector(".button-1.cart-button");
    By price = By.xpath("//span[@id='price-value-1']");
    By verifyText = By.xpath("//p[@class='content']");



    public String getTextFromBuildYourOwnComputerMessage() {
        return getTextFromElement(buildYourOwnComputerMessage);
    }

   /* public void verifyTheBuildYourOwnComputerMessage() {
        String expectedMessage1 = "assertEquals";
        Assert.assertEquals(desktop.verifyTotal(), "£74.73", "Total not matched");
       // String actualMessage = getTextFromBuildYourOwnComputerMessage();
        Assert.assertEquals(getTextFromBuildYourOwnComputerMessage(),"assertEquals","page not found");
        //Assert.assertequal(expectedMessage, actualMessage, "Build your own computer Message is not displayed correctly");
    }*/

    public void selectGhzIntelPentiumDualCore() {
        selectByValueFromDropDown(processor,"1");
    }

    public void selectRamAs8Gb(int index) {
        selectByIndexFromDropDown(ram, index);
    }

    public void selectHDDRadio() {
        clickOnElement(hdd);
    }

    public void selectOSRadioButton() {
        clickOnElement(os);
    }

    public void clickOnTotalCommander() {
        clickOnElement(softwareBox2);
    }



    public String getTextFromActualTotal(){
        return getTextFromElement(actualTotal);
    }

    public String verifyThePrice() {
return getTextFromElement(price);
    }

       // String expectedTotal = "$1,475.00";
        //String actualTotal = getTextFromActualTotal();
        //VerifyElements(expectedTotal, actualTotal, "Total is displayed incorrectly");
   // }*/

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getTextFromProductHasBeenAddedToYourShoppingCart(){
        return getTextFromElement(productAddedMessage);
    }

   /* public void verifyProductHasBeenAddedToYourShoppingCartMessage(){
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = getTextFromProductHasBeenAddedToYourShoppingCart();
        doVerifyElements(expectedMessage, actualMessage, "Message displayed incorrectly");
    }*/

    public void closeTheBarByClickingOnCrossButton(){
        clickOnElement(closingBarButton);
    }

    public void mouseHoverOnShoppingCart(){
        clickOnElement(shoppingCartOption);
    }

    public void clickOnGoToCartButton(){
        clickOnElement(goToCartButton);
    }
    public String verifyTheMessage() {
        return getTextFromElement(verifyText);
    }


}
