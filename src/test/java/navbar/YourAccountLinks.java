package navbar;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class YourAccountLinks extends Base {


    @Test (priority = 1)
    public void testOpenYourAccountLink() throws InterruptedException {
        var caption = homePage.hoverOverNavAccount();
        caption.openYourAccountLink();
        Thread.sleep(3000);
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        assertEquals(windowHeading,
                "Your Account",
                "Wrong window name");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
        assertEquals(backWindow,
                "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more",
                "Wrong window name");
    }

    @Test (priority = 2)
    public void testOpenYourOrdersLink(){
        var caption = homePage.hoverOverNavAccount();
        caption.openYourOrdersLink();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        assertEquals(windowHeading,
                "Amazon Sign In",
                "Wrong window name");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
        assertEquals(backWindow,
                "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more",
                "Wrong window name");
    }

}
