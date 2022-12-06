package com.nopcommerce.demo.pages.electronics;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class CelloPhonesListViewPage extends Utility {
   // By nokiaLumia1020 = By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div > div > div:nth-child(3) > div > div.picture > a > img");
    By nokiaLumia1020= By.xpath("//div[@class='products-wrapper']//a[@href='/nokia-lumia-1020']");
// public static WebDriver driver;
    public void clickOnNokiaLumiaLink() {
        //driver.navigate().refresh();

      try {
            clickOnElement(nokiaLumia1020);
       }catch(
    StaleElementReferenceException e){
         clickOnElement(By.xpath("//div[@class='products-wrapper']//a[@href='/nokia-lumia-1020']"));
        }

    }
}
