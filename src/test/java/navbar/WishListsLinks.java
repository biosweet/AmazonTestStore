package navbar;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WishListsLinks extends Base {

    @Test (priority = 1)
    public void testOpenFindAGiftLink(){
        var caption = homePage.hoverOverNavAccount();
        caption.openFindAGiftLink();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [ " + windowHeading + " ] page");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [ " + backWindow + " ] page");
    }

    @Test (priority = 2)
    public void testOpenCreateAListLink(){
        var caption = homePage.hoverOverNavAccount();
        caption.openCreateAListLink();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
    }

    @Test (priority = 3)
    public void testOpenSaveItemsFromTheWebLink(){
        var caption = homePage.hoverOverNavAccount();
        caption.openSaveItemsFromTheWebLink();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
    }

    @Test (priority = 4)
    public void testOpenWeddingList(){
        var caption = homePage.hoverOverNavAccount();
        caption.openWeddingList();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        assertEquals(windowHeading,
                "Amazon Wedding",
                "Wrong window name");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
        assertEquals(backWindow,
                "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more",
                "Wrong window name");
    }

    @Test (priority = 5)
    public void testOpenBabyWishList(){
        var caption = homePage.hoverOverNavAccount();
        caption.openBabyWishList();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        assertEquals(windowHeading,
                "Amazon Baby Wishlist",
                "Wrong window name");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
        assertEquals(backWindow,
                "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more",
                "Wrong window name");
    }
    @Test (priority = 6)
    public void testOpenDiscoverYourStyleLink(){
        var caption = homePage.hoverOverNavAccount();
        caption.openDiscoverYourStyleLink();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        assertEquals(windowHeading,
                "Discover your style | Amazon.co.uk",
                "Wrong window name");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
        assertEquals(backWindow,
                "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more",
                "Wrong window name");
    }

    @Test (priority = 7)
    public void testOpenExploreShowRoomLink(){
        var caption = homePage.hoverOverNavAccount();
        caption.openExploreShowRoomLink();
        String windowHeading = getWindowManager().getTitle();
        System.out.println("The link leads to [" + windowHeading + "] page");
        assertEquals(windowHeading,
                "Welcome to Amazon's Showroom",
                "Wrong window name");
        getWindowManager().goBack();
        String backWindow = getWindowManager().getTitle();
        System.out.println("The back button then leads to [" + backWindow + " ] page");
        assertEquals(backWindow,
                "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more",
                "Wrong window name");
    }
}
