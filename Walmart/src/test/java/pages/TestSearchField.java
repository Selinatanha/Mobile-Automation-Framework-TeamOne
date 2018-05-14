package pages;

import org.testng.annotations.Test;

public class TestSearchField extends WalmartSearch {
    @Test
    public void TestSearch(){
        handlePopUp();
        clickOnSearch();
        typeOnSearchField();
    }
}
