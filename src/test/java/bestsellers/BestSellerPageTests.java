package bestsellers;

import Base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BestSellerPageTests extends Base {

    @Test (priority = 0)
    public void testHeading() throws InterruptedException {
      //  homePage.acceptCookies();
        var bestSellerPage = homePage.clickBestSellerPage();
        Thread.sleep(1000);
        String bannerText = bestSellerPage.getBannerText();
        Thread.sleep(1000);
        assertEquals(bannerText, "Amazon Best Sellers", "Heading is different");
        System.out.println("Banner test is: " + bannerText);
    }

    @Test (priority = 1)
    public void testSubHeading() throws InterruptedException {
        //homePage.acceptCookies();
        var bestSellerPage = homePage.clickBestSellerPage();
        Thread.sleep(1000);
        String bannerSubText = bestSellerPage.getBannerSubText();
        Thread.sleep(1000);
        assertEquals(bannerSubText, "Our most popular products based on sales. Updated frequently.", "SubHeading is different");
        System.out.println("Banner subtext is: " + bannerSubText);
    }

    @Test (priority = 2)
    public void testCountCarousels() throws InterruptedException {
      //  homePage.acceptCookies();
        var bestSellerPage = homePage.clickBestSellerPage();
        Thread.sleep(1000);
        bestSellerPage.countCarouselsOnPage();
    }
    @Test
    public void test(){

    }


}
