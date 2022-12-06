package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {



    public void selectMenu(String menu)  {
        List<WebElement> name = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li"));
        try {
            //System.out.println(name);
            for (WebElement name1 : name) {
                //System.out.println(name1);
                if (name1.getText().equalsIgnoreCase(menu)) {
                    name1.click();
                    break;
                }
            }
        }catch(StaleElementReferenceException e){
            name = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li"));
        }

    }





    }

