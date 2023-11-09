package navbar;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountAndListsNavBarTests extends Base {


    @Test
    public void testAccountHoverOverSignInButton() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverNavAccount();
        Thread.sleep(3000);
        var caption = homePage.hoverOverNavAccount();
        assertEquals(caption.signInButtonText(), "Sign in", "Wrong Text");
        System.out.println(caption.signInButtonText());
    }

    @Test
    public void testLinksYourLists() {
        var caption = homePage.hoverOverNavAccount();
        caption.countLinksYourLists();
    }

    @Test
    public void testLinksYourAccount() {
        var caption = homePage.hoverOverNavAccount();
        caption.countYourAccountLinks();
    }

    @Test
    public void testAccountHoverOverYourLists() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverNavAccount();
        Thread.sleep(3000);
        var caption = homePage.hoverOverNavAccount();
        assertEquals(caption.getYourListsText(), "Your Lists", "Wrong Text");
        System.out.println(caption.getYourListsText());
    }




}
