package pages;

import org.testng.annotations.Test;

public class TestShoppingCart extends ShoppingCart {
     @Test
    public void test(){
         searchForItem();
         selectItem();
         clickOnShoppingCartIconToAddItem();
     }
}
