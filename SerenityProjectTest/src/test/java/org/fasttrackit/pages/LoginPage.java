package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id= "username")
    private WebElementFacade emailField;

    @FindBy (id= "password")
    private WebElementFacade passwordField;

    @FindBy (css = "[name=login]")
    private WebElementFacade loginButton;

    @FindBy(css = "[for = password] span.required")
    private WebElementFacade requiredPasswordElement;

    public void setEmailField(String value){
        typeInto(emailField,value);
    }

    public void setPasswordField(String value){
        typeInto(passwordField, value);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }
    public String getRequiredPasswordText() {
        waitFor(requiredPasswordElement);
        return requiredPasswordElement.getText();
    }


}
