package dataDriven;

import base.MobileAPI;
import org.openqa.selenium.By;
import utility.Xls_Reader;

public class ExcelReader extends MobileAPI {

    public void getDataFromExcelSheet() {
        Xls_Reader reader = new Xls_Reader("/Users/selinatanha/Mobile-Automation-Framework-TeamOne/Walmart/data/file2.xls");
        String firstName= reader.getCellData("sheet1",1,2);
        String lastName= reader.getCellData("sheet1",2,2);
        String email= reader.getCellData("sheet1",3,2);
        String password= reader.getCellData("sheet1",4,2);
        ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys(firstName);
        ad.findElement(By.id("com.walmart.android:id/lastname")).sendKeys(lastName);
        ad.findElement(By.id("com.walmart.android:id/email")).sendKeys(email);
        ad.findElement(By.id("com.walmart.android:id/password")).sendKeys(password);
    }
}
