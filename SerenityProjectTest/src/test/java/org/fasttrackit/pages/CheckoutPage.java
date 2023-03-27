package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy (id = "billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy (id = "billing_last_name")
    private WebElementFacade lastNameField;


    @FindBy(css = "select2-billing_country-container")
    private WebElementFacade dropDown_Country;

    @FindBy (id = "billing_address_1")
    private WebElementFacade addressNameField;

    @FindBy (id = "billing_city")
    private WebElementFacade cityNameField;

    @FindBy (id = "billing_postcode")
    private WebElementFacade postcodeField;

    @FindBy (id = "billing_phone_field")
    private WebElementFacade phoneField;

    @FindBy (id = "billing_email")
    private WebElementFacade emailCheckoutField;

    @FindBy (id = "place_order")
    private WebElementFacade placeOrderButton;

    public void setFirstNameField(String value) {
        typeInto(firstNameField, value);
    }
    public void setLastNameField(String value) {
        typeInto(lastNameField, value);
    }
    public void selectDropdowValues()
    {dropDown_Country.selectByVisibleText("Romania");}

    public void setAddressNameField(String value) {
        typeInto(addressNameField, value);
    }
    public void setCityNameField(String value) {
        typeInto(cityNameField, value);
    }
    public void setPostcodeField(String value) {
        typeInto(postcodeField, value);
    }
    public void setPhoneField(String value) {
        typeInto(phoneField, value);
    }
    public void setEmailCheckoutField(String value) {
        typeInto(emailCheckoutField, value);
    }
    public void clickPlaceOrderButton() {
        clickOn(placeOrderButton);
    }

}
