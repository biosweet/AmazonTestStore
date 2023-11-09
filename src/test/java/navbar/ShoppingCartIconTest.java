package navbar;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ShoppingCartIconTest extends Base {
    @Test
    public void testShoppingCartCount() {
        homePage.getShoppingCartItems();
        assertTrue(homePage.getShoppingCartItems().contains("0"), "Wrong count");
        String numberItems = homePage.getShoppingCartItems();
        System.out.println("Cart has: " + numberItems + " items");
    }

    @Test
    public void testCheckShoppingCart() {
        homePage.checkShoppingCart();
        String title = getWindowManager().getTitle();
        System.out.println(title);
        getWindowManager().goBack();
        getWindowManager().getRefresh();
    }
}
