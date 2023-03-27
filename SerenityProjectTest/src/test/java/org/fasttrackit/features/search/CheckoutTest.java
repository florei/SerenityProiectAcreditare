package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    private String productName = "Beanie";

    @Test
    public void validCheckoutTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.goToProductDetailsPage(productName);
        cartSteps.clickAddToCart();
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.typeFirstNameField("Florentina");
        checkoutSteps.typeLastNameField("Alexa");
        checkoutSteps.typeCountryNameField("Romania");
        checkoutSteps.typeAddressNameField("Aleea Parc");
        checkoutSteps.typeCityNameField("Focsani");
        checkoutSteps.typePostcodeNameField("12546");
        checkoutSteps.typePhoneField("0732587954");
        checkoutSteps.typeEmailCheckoutField("florentina.alxa6@gmail.com");
        checkoutSteps.clickPlaceOrderButton();


    }
}
