package org.fasttrackit.features.search;

import org.fasttrackit.Utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
    }

    @Test
    public void invalidPasswordLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword("123123123123");
        loginSteps.clickLogin();


    }

    @Test
    public void invalidEmailLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("test");
        loginSteps.typePassword("123");
        loginSteps.clickLogin();


    }

    @Test
    public void verifyPasswordRequiredFieldTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.clickLogin();

    }



}
