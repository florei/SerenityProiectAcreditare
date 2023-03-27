package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage  {

    @FindBy(css = "[type ='submit'][value='26']")
    private WebElementFacade addToCartButton;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
}
