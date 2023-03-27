package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class SearchResultsPage extends BasePage{

    @FindBy(css = ".products.columns-4 a.collection_title ")
    private List<WebElementFacade> listOfProductNames;

    @FindBy(css = ".products.columns-4 .price")
    private List<WebElementFacade> listOfPrices;

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdown;

    public boolean isProductInList(String productName) {
        waitFor(listOfProductNames.get(0));

        for (WebElementFacade element : listOfProductNames) {
            if (element.getText().equalsIgnoreCase(productName)) {
                element.click();
                return true;
            }
        }
        return false;
    }

    public void selectPriceFromDropdown() {
        sortByDropdown.selectByIndex(4);
    }

   public boolean isPriceAscending() {
        int firstPrice = getIntFromPrice(listOfPrices.get(0).getText());
        int secondPrice = getIntFromPrice(listOfPrices.get(listOfPrices.size() - 1).getText());
        return firstPrice <= secondPrice;
    }

}
