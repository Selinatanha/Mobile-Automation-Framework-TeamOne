package pages;

import base.MobileAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingCart extends MobileAPI {
    public void searchForItem(){
        WalmartSearch walmartSearch = new WalmartSearch();
        walmartSearch.handlePopUp();
        walmartSearch.clickOnSearch();
        walmartSearch.typeOnSearchField();
        walmartSearch.clickSearch();
    }
    public void selectItem(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView");
    }

    public void clickOnShoppingCartIconToAddItem(){
     clickByXpath("//android.widget.FrameLayout[@content-desc=\"Shopping cart, no items\"]/android.widget.ImageView");
    }
}
