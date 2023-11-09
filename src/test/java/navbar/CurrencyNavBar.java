package navbar;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CurrencyNavBar extends Base {

    @Test
    public void testHoverOverCurrencyBarAll() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverLanguage();
        Thread.sleep(3000);
        var caption = homePage.hoverOverLanguage();
        assertEquals(caption.getTitle(), "Change currency", "Wrong title");
        System.out.println(caption);
        assertEquals(caption.getLinkText(),"Learn more","Wrong link text");
        System.out.println(caption.getLinkText());
        assertTrue(caption.getLink().endsWith("=GDX4RY8D2M85FHLD"),"Wrong link is presented");
        System.out.println(caption.getLink());
    }

    @Test
    public void testHoverOverCurrencyBarTitle() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverLanguage();
        Thread.sleep(3000);
        var caption = homePage.hoverOverLanguage();
        assertEquals(caption.getTitle(), "Change currency", "Wrong title");
        System.out.println(caption);
    }
    @Test
    public void testHoverOverCurrencyBarLinkText() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverLanguage();
        Thread.sleep(3000);
        var caption = homePage.hoverOverLanguage();
        assertEquals(caption.getLinkText(),"Learn more","Wrong link text");
        System.out.println(caption.getLinkText());
    }
    @Test
    public void testHoverOverCurrencyBarLink() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverLanguage();
        Thread.sleep(3000);
        var caption = homePage.hoverOverLanguage();
        assertTrue(caption.getLink().endsWith("=GDX4RY8D2M85FHLD"),"Wrong link is presented");
        System.out.println(caption.getLink());
    }

    @Test
    public void testHoverOverCurrencyBarCaptionDisplay() throws InterruptedException {
        Thread.sleep(1000);
        homePage.hoverOverLanguage();
        Thread.sleep(3000);
        var caption = homePage.hoverOverLanguage();
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        System.out.println(caption.isCaptionDisplayed());
    }
}
