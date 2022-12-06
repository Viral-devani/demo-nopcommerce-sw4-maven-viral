package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    Computers computers = new Computers();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    SignInPage signInPage = new SignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CheckOutFinalPage checkOutFinalPage = new CheckOutFinalPage();
    WelcomeToOurStorePage welcomeToOurStorePage = new WelcomeToOurStorePage();


    @Test
    public void testComputersPage() throws InterruptedException {

        homePage.selectMenu("Computers");
        computers.clickOnDesktopOptionOfComputerTab();
        Thread.sleep(2000);
        //desktopPage.selectSortByZToAFromDropDownMenu("Name: Z to A");
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }

    @Test
    public void verifyProductAddedToShoppinCartSuccessfully() throws InterruptedException {
        homePage.selectMenu("Computers");
        Thread.sleep(2000);
        computers.clickOnDesktopOptionOfComputerTab();
        desktopPage.clickOnAddToCartForBuildYourOwnComputer();
        buildYourOwnComputer.getTextFromBuildYourOwnComputerMessage();
        Thread.sleep(2000);
        buildYourOwnComputer.selectGhzIntelPentiumDualCore();
        Thread.sleep(2000);
        buildYourOwnComputer.selectRamAs8Gb(3);
        buildYourOwnComputer.selectHDDRadio();
        buildYourOwnComputer.selectOSRadioButton();
        buildYourOwnComputer.clickOnTotalCommander();
        //  String expectedPrice = "$1,420.00";
        // Assert.assertEquals(buildYourOwnComputer.verifyThePrice(),expectedPrice,"PriceText not Matched");

        buildYourOwnComputer.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputer.verifyTheMessage(), expectedText, " not Matched");

        buildYourOwnComputer.closeTheBarByClickingOnCrossButton();
        Thread.sleep(2000);
        // buildYourOwnComputer.clickOnGoToCartButton();
        buildYourOwnComputer.mouseHoverOnShoppingCart();
        Thread.sleep(2000);

        shoppingCartPage.getTextFromDisplayMessage();
        shoppingCartPage.clearTheQuantityField();
        shoppingCartPage.updateTheQuantityField("2");
        shoppingCartPage.clickOnUpdateShoppingCart();
        shoppingCartPage.getTextFromAmountElement();
        String expectedAmount = "$2,950.00";
        Assert.assertEquals(shoppingCartPage.getTextFromAmountElement(), expectedAmount, "Price not matched");
        shoppingCartPage.clickOnTermsAndConditionsAgreeBox();
        shoppingCartPage.clickOnCheckoutButton();

        signInPage.getTextFromWelcomeMessage();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(signInPage.getTextFromWelcomeMessage(), expectedMessage, "Message is not displyed");
        signInPage.clickOnCheckOutAsAGuestTab();

        checkOutPage.enterNameInTheFirstNameField("prime");
        checkOutPage.enterLastNameInTheLastNameField("Testing");
        checkOutPage.enterRandomEmailInTheEmailField("prime" + getAlphaNumericString(5) + "@gmail.com");
        checkOutPage.selectDataFromCountryDropDown(3);
        checkOutPage.enterDataInTheCityField("London");
        checkOutPage.enterDataInTheAddress1Field("123 something");
        checkOutPage.enterDataInTheZipPostalCodeField("HA12CD");
        checkOutPage.enterDataInTheMobileNumberField("07692312602");
        checkOutPage.clickOnContinueButton();
        checkOutPage.clickOnNextDayRadioButton();
        checkOutPage.clickOnContinueButton1();
        checkOutPage.clickOnCreditCard();
        checkOutPage.clickOnContinueButton2();

        paymentInfoPage.selectCreditCardType(1);
        paymentInfoPage.inputCardHoldersName("Queen");
        paymentInfoPage.inputCardNumber("5555 5555 5555 4444");
        paymentInfoPage.inputExpireMonth("11");
        paymentInfoPage.inputExpireYear("2025");
        paymentInfoPage.inputCardCode("456");
        paymentInfoPage.clickOnContinueButton();

        confirmOrderPage.getTextFromPaymentMethodText();
        String expectedMessage2 = "Credit Card";
        Assert.assertEquals(confirmOrderPage.getTextFromPaymentMethodText(), expectedMessage2, "option is not displyed");
        confirmOrderPage.getTextFromShippingMethodText();
        String expectedMessage3 = "Next Day Air";
        Assert.assertEquals(confirmOrderPage.getTextFromShippingMethodText(), expectedMessage3, "Shipping method is not displyed");
        confirmOrderPage.getTextFromTotalAmountComputersField();
        String expectedMessage4 = "$2,950.00";
        Assert.assertEquals(confirmOrderPage.getTextFromTotalAmountComputersField(), expectedMessage4, "Total is incorrect");
        confirmOrderPage.clickOnConfirmButton();

        checkOutFinalPage.getTextFromThankYouMessage();
        String expectedMessage5 = "Thank you";
        Assert.assertEquals(checkOutFinalPage.getTextFromThankYouMessage(), expectedMessage5, "Message is displayed incorrectly");
        checkOutFinalPage.getTextFromOrderProcessedSuccessfullyMessage();
        String expectedMessage6 = "Your order has been successfully processed!";
        Assert.assertEquals(checkOutFinalPage.getTextFromOrderProcessedSuccessfullyMessage(), expectedMessage6, "Message is displayed incorrectly");
        checkOutFinalPage.clickOnContinueButton();

        welcomeToOurStorePage.getTextFromWelcomeToStore();
        String expectedMessage7 = "Welcome to our store";
        Assert.assertEquals(welcomeToOurStorePage.getTextFromWelcomeToStore(), expectedMessage7, "Message is displayed incorrectly");


    }


}
