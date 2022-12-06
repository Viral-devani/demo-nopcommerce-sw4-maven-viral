package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsCellPhones extends Utility {

    By electronics=By.linkText("Electronics");
    By cellPhones=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");

    By cellPhonesPageText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");


/*Mouse Hover on “Electronics” Tab, Mouse Hover on “Cell phones” and click
        Verify the text “Cell phones”*/
    public void mouseHoverOnElectronicPageAndClick(){
        mouseHoverToElement(electronics);
        mouseHoverToElementAndClick(cellPhones);
    }
    public String getCellPhonesPageWelcomeText(){

        return getTextFromElement(cellPhonesPageText);
    }
    public void clickOnTheListViewTab(){
        clickOnElement(listViewTab);
    }

}
