package pages;

import org.testng.annotations.Test;

public class TestGoingThroughImages extends GoigThroughImages {
    @Test
    public void testGoingThroughImages(){
        searchAndSeletElement();
        clickOnItemImage();
        clikThroughStockImages();
    }
}
