package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.Utils.Messages;
import org.junit.Assert;

public class LoginSteps extends BaseSteps{

    @Step
    public void navigateToLoginPage() {
        homePage.clickOnAccountbutton();
    }
    @Step
    public void typeUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void userIsLoggedIn(String userName) {
//        Assert.assertTrue(accountPage.isWelcomeText(userName));
      Assert.assertEquals("Hello " + userName, accountPage.getWelcomeText());
  //      accountPage.userIsLoggedIn(userName);
    }


    @Step
    //grupam mai multi pasi
    public void doLogin(String email, String pass) {
        navigateToLoginPage();
        typeUserEmail(email);
        typePassword(pass);
        clickLogin();
    }

    @Step
    public void checkPasswordFieldRequired() {
        Assert.assertEquals(Messages.THIS_IS_A_REQUIRED_FIELD, loginPage.getRequiredPasswordText());
    }

}
