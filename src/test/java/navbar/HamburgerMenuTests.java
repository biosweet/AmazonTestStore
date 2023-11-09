package navbar;

import Base.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HamburgerMenuOnHomePage;

public class HamburgerMenuTests extends Base {

    @Test
    public void testHamburgerMenuOpens(){
       var hamburgerMenu = homePage.getHamburgerMenu();
    }

    @Test
    public void testCountHamburgerMenuLinks(){
        var hamburgerMenu = homePage.getHamburgerMenu();
        hamburgerMenu.countHamburgerMenuLinks();
    }
    @Test
    public void testHamburgerMenuLinkPrimeVideo() throws InterruptedException {
        var hamburgerMenu = homePage.getHamburgerMenu();
        hamburgerMenu.clickOnPrimeVideoLink();
        Thread.sleep(3000);
    }
    @Test
    public void testBackToMainMenu()throws InterruptedException{
        var hamburgerMenu = homePage.getHamburgerMenu();
        hamburgerMenu.clickOnPrimeVideoLink();
        Thread.sleep(2000);
        hamburgerMenu.backToMainMenu();
        Thread.sleep(3000);
    }

}
