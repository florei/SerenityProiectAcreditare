package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(css ="strong:nth-child(1)")
    private WebElementFacade welcomeTextElement;

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

    public void userIsLoggedIn(String userName){
        welcomeTextElement.shouldContainOnlyText("Hello, " + userName + "!");
    }
}
