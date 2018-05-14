package dataDriven;

import base.MobileAPI;
import pages.WalmartSearch;

public class Registration extends MobileAPI {
    public void clickOnBurgerButton(){
        WalmartSearch walmartSearch = new WalmartSearch();
        walmartSearch.handlePopUp();
        clickByXpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    }
    public void clickOnSignIn(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Button");
    }
    public void handlePopup(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button");
    }
    public void clickOnCreateAnAccount(){
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button");
    }
    public void enterDataIntoFields(){
        ExcelReader excelReader = new ExcelReader();
        excelReader.getDataFromExcelSheet();
    }
}
