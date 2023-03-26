package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void clickAddToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void verifyProductWasAddedToCart(String productName) {
        Assert.assertTrue("Product was not added to cart!", cartPage.wasProductWasAddedToCart(productName));
    }
}
