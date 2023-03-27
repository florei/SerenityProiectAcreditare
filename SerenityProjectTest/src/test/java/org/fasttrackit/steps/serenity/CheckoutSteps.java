package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void navigateToCheckoutPage() {
        homePage.clickOnCheckoutButton();
    }

    @Step
    public void typeFirstNameField(String firstName) {
        checkoutPage.setFirstNameField(firstName);
    }

    @Step
    public void typeLastNameField(String lastName){
        checkoutPage.setLastNameField(lastName);
    }
    @Step
    public void selectCountry (String Country){
        checkoutPage.selectDropdowValues();
    }
    @Step
    public void typeAddressNameField(String addressName){
        checkoutPage.setAddressNameField(addressName);
    }
    @Step
    public void typeCityNameField(String cityName){
      checkoutPage.setCityNameField(cityName);
    }
    @Step
    public void typePostcodeNameField(String postcodeName){
        checkoutPage.setPostcodeField(postcodeName);
    }
    @Step
    public void typePhoneField(String phone){
        checkoutPage.setPhoneField(phone);
    }
    @Step
    public void typeEmailCheckoutField(String emailCheckout){
        checkoutPage.setEmailCheckoutField(emailCheckout);
    }

    @Step
    public void clickPlaceOrderButton() {
       checkoutPage.clickPlaceOrderButton();
    }







}
