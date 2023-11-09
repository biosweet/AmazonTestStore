package navbar;

import Base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BasicSearchTests extends Base {

    @Test
    public void testSearchField() throws InterruptedException {
        homePage.setSearch("cocktail");
    }

    @Test
    public void testClearSearchField() throws InterruptedException {
        homePage.setSearch("cocktail");
        Thread.sleep(1500);
        homePage.clearSearch();
        Thread.sleep(1500);
        homePage.setSearch("Steve The Bartender");
        Thread.sleep(1000);
    }



    @Test
    public void testLogo() {
        String logo = homePage.checkLogo();
        System.out.println(logo);
    }




}
