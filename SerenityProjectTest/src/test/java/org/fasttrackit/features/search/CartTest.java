package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    private String productName = "Beanie";

    @Test
    public void addToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.goToProductDetailsPage(productName);
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart(productName);
    }

}
