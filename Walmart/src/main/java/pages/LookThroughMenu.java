package pages;

import base.MobileAPI;

public class LookThroughMenu extends MobileAPI {
    public void clickOnBurgerButton(){
        WalmartSearch walmartSearch = new WalmartSearch();
        walmartSearch.handlePopUp();
        clickByXpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    }
    public void scrollDown(){
        scroll_to("Help");
    }
}
