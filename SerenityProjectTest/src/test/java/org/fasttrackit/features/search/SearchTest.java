package org.fasttrackit.features.search;

import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchForProductKeywordTest(){
        searchSteps.searchForKeyword("Beanie");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("Beanie with Logo");
    }

    @Test
    public void searchForFullProductNameTest(){
        searchSteps.searchForKeyword("Beanie with Logo");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("Beanie with Logo");
    }

    @Test
    public void verifyPriceAscendingTest(){
        searchSteps.searchForKeyword("Beanie");
        searchSteps.clickSearchIcon();
        searchSteps.orderProductsByPrice();
        searchSteps.productsAreSortedByPriceAscending();
    }


}
