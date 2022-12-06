package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.SignInPage;
import com.nopcommerce.demo.pages.electronics.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsCellPhones electronicsCellPhones = new ElectronicsCellPhones();
    CelloPhonesListViewPage celloPhonesListViewPage = new CelloPhonesListViewPage();
    CellphoneListViewNokiaLumiaPage cellphoneListViewNokiaLumiaPage = new CellphoneListViewNokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationComplete registrationComplete = new RegistrationComplete();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    ShippingOption shippingOption = new ShippingOption();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentDetail paymentDetail = new PaymentDetail();
    ConfirmOrder confirmOrder = new ConfirmOrder();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronicsCellPhones.mouseHoverOnElectronicPageAndClick();
        electronicsCellPhones.getCellPhonesPageWelcomeText();
        electronicsCellPhones.clickOnTheListViewTab();


    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        electronicsCellPhones.mouseHoverOnElectronicPageAndClick();
        electronicsCellPhones.getCellPhonesPageWelcomeText();
        electronicsCellPhones.clickOnTheListViewTab();
        celloPhonesListViewPage.clickOnNokiaLumiaLink();
        cellphoneListViewNokiaLumiaPage.getTextFromNokiaLumiaDisplayText();
        Assert.assertEquals(cellphoneListViewNokiaLumiaPage.getTextFromNokiaLumiaDisplayText(), "Nokia Lumia 1020", "Text is not matched");
        cellphoneListViewNokiaLumiaPage.getTextFromNokiaLumiaPrice();
        Assert.assertEquals(cellphoneListViewNokiaLumiaPage.getTextFromNokiaLumiaPrice(), "$349.00", "price is not matched");
        cellphoneListViewNokiaLumiaPage.clearTheQuantityField();
        cellphoneListViewNokiaLumiaPage.UpdatedQuantityForNokiaLumia1020("2");
        cellphoneListViewNokiaLumiaPage.clickOnNokiaLumiaAddToCartButton();
        cellphoneListViewNokiaLumiaPage.getProductAddedToCartMessage();
        Assert.assertEquals(cellphoneListViewNokiaLumiaPage.getProductAddedToCartMessage(), "The product has been added to your shopping cart", "Add to Cart Message is not displayed correctly");
        cellphoneListViewNokiaLumiaPage.closeTheGreenBarByClickingTheCrossButton();
        cellphoneListViewNokiaLumiaPage.mouseHoverOnNokiaLumiaShoppingCartButton();
        cellphoneListViewNokiaLumiaPage.clickOnNokiaLumiaGoToCartButton();
        Assert.assertEquals(shoppingCartPage.getTextFromDisplayMessage(), "Shopping cart", "Not Matching");
        shoppingCartPage.updateTheQuantityField("2");
        Assert.assertEquals(shoppingCartPage.getTextFromAmountElement(), "$698.00", "Not matching");
        shoppingCartPage.clickOnTermsAndConditionsAgreeBox();
        shoppingCartPage.clickOnCheckoutButton();


        Assert.assertEquals(signInPage.getTextFromWelcomeMessage(), "Welcome, Please Sign In!", "Not Matching");
        signInPage.clickOnRegisterTab();
        Assert.assertEquals(registrationPage.getTextFromRegisterMessage(), "Register", "Not Matching");
        registrationPage.enterFirstName("John");
        registrationPage.enterLastName("Smith");
        registrationPage.enterEmail("john" + getAlphaNumericString(4) + "@gmail.com");
        registrationPage.enterPassword("abc123");
        registrationPage.enterConfirmPassword("abc123");
        registrationPage.clickOnRegisterButton();

        Assert.assertEquals(registrationComplete.getTextFromRegisterationCompleteMessage(), "Register", "Not Matching");

        Assert.assertEquals(shoppingCart.getTextFromDisplayMessage(), "Shopping cart", "Message is not displyed");
        shoppingCart.clickOnTermsAndConditionsAgreeBox();
        shoppingCart.clickOnCheckoutButton();

        shippingOption.clickOnButton2ndDayAir();
        shippingOption.clickOnContinueButton();

        paymentMethodPage.clickOnCreditCardRadioButton();
        paymentMethodPage.clickOnContinueButton();

        paymentDetail.selectCreditCardType(0);
        paymentDetail.inputCardHoldersName("Peter Rabit");
        paymentDetail.inputCardNumber("5555 5555 5555 4444");
        paymentDetail.inputExpireMonth("12");
        paymentDetail.inputExpireYear("2025");
        paymentDetail.inputCardCode("143");
        paymentDetail.clickOnContinueButton();


        Assert.assertEquals(confirmOrder.getTextFromPaymentMethodText(), "Credit Card", "Not Matching");
        confirmOrder.clickOnConfirmButton();


    }
}