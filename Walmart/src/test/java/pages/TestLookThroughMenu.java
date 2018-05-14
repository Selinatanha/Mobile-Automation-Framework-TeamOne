package pages;

import org.testng.annotations.Test;

public class TestLookThroughMenu extends LookThroughMenu {
    @Test
    public void TestSrollingDownMenu(){
        clickOnBurgerButton();
        scrollDown();
    }
}
