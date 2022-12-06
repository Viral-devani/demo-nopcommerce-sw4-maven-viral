package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellphoneListViewNokiaLumiaPage extends Utility {
    By nokiaLumia1020DisplayText =By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumia1020Price = By.xpath("//span[@id='price-value-20']");
    By nokiaLumia1020OldQuantity = By.id("product_enteredQuantity_20");
    By nokiaLumiaAddToCartButton = By.id("add-to-cart-button-20");
    By nokiaLumiaAddToCartGreenMessage = By.xpath("//p[@class='content']");
    By nokiaLumiaMessageClosingCrossButton = By.cssSelector("span[title='Close']");
    By nokiaLumiaShoppingCartButton = By.xpath("//span[text()='Shopping cart']");
    By nokiaLumiaShoppingCartButtonsGoToCartOption = By.xpath("//button[text()='Go to cart']");

    public String getTextFromNokiaLumiaDisplayText(){
        return getTextFromElement(nokiaLumia1020DisplayText);
    }



    public String getTextFromNokiaLumiaPrice(){
        return getTextFromElement(nokiaLumia1020Price);
    }


    public void clearTheQuantityField() {
        driver.findElement(nokiaLumia1020OldQuantity).clear();
    }
   // public void clearTextFromTheNokiaLumiaQuantityField(){
     //   doFindElementAndClearText(nokiaLumia1020OldQuantity);
    //}

    public void UpdatedQuantityForNokiaLumia1020(String quantity){
        sendTextToElement(nokiaLumia1020OldQuantity, quantity);
    }

    public void clickOnNokiaLumiaAddToCartButton(){
        clickOnElement(nokiaLumiaAddToCartButton);
    }
    public String getProductAddedToCartMessage(){
        return getTextFromElement(nokiaLumiaAddToCartGreenMessage);
    }


    public void closeTheGreenBarByClickingTheCrossButton(){
        clickOnElement(nokiaLumiaMessageClosingCrossButton);
    }

    public void mouseHoverOnNokiaLumiaShoppingCartButton(){
        mouseHoverToElement(nokiaLumiaShoppingCartButton);
    }

    public void clickOnNokiaLumiaGoToCartButton(){
        clickOnElement(nokiaLumiaShoppingCartButtonsGoToCartOption);
    }
}
