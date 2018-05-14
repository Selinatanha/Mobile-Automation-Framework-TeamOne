package pages;

import base.MobileAPI;

public class GoigThroughImages extends MobileAPI {
    public void searchAndSeletElement(){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.searchForItem();
        shoppingCart.selectItem();
    }
    public void clickOnItemImage(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.View/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.ImageView");
    }
    public void clikThroughStockImages(){
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Product image thumbnail 2 of 6\"]/android.widget.ImageView");
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Product image thumbnail 3 of 6\"]/android.widget.ImageView");
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Product image thumbnail 4 of 6\"]/android.widget.ImageView");
    }
}
