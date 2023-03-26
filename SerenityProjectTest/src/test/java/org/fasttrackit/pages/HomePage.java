package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")

public class HomePage extends BasePage {

    @FindBy(css = "#menu-item-70 > a")
    private WebElementFacade accountbutton;

    @FindBy(css = "div .search-form .search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade searchButton;


    public void clickOnAccountbutton(){
        clickOn(accountbutton);
    }
    public void setSearchField(String value){
        typeInto(searchField,value);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }



}
