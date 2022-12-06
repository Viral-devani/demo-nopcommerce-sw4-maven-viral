package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topmenu extends BaseTest {
    HomePage homePage=new HomePage();
    Computers computers=new Computers();

    @Test
    public void verifyPageNavigation(){
        homePage.selectMenu("Computers");
        String expectedMessage1 = "Computers";
        Assert.assertEquals(computers.getComputersPageText(), expectedMessage1, "Page not found");
        homePage.selectMenu("Electronics");
        homePage.selectMenu("Apparel");
        homePage.selectMenu("Digital downloads");
        homePage.selectMenu("Books");
        homePage.selectMenu("Jewelry");
        homePage.selectMenu("Gift Cards");


    }
}
