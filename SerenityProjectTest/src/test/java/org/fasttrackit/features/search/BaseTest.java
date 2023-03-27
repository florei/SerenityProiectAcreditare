package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.Utils.Constants;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//clasa de baza pentru clasele de tip test
@RunWith(SerenityRunner.class)

public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    //protected inseamna pasi vizibili in pachetul features
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @Before
    public void initTests(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }


}
