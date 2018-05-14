package testDataDriven;

import dataDriven.Registration;
import org.testng.annotations.Test;


public class TestRegistration extends Registration {
    @Test
    public void testRegistration()  {
        clickOnBurgerButton();
        clickOnSignIn();
        handlePopup();
        clickOnCreateAnAccount();
        enterDataIntoFields();
    }

}
