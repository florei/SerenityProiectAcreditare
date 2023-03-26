package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage{

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade addedToCartMessage;

    public boolean wasProductWasAddedToCart(String productName) {
        return addedToCartMessage.getText().equalsIgnoreCase(productName + " was added to your shopping cart.");
    }
}
