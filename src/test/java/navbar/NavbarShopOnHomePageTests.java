package navbar;

import Base.Base;
import org.testng.annotations.Test;

public class NavbarShopOnHomePageTests extends Base {

    @Test (priority = 1)
    public void testCountLinks() {
        homePage.countLinksNavbarShopping();
    }

    @Test (priority = 2)
    public void testClickOnBestSellers() {
        homePage.clickBestSellers();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 3)
    public void testClickOnGiftIdeas() {
        homePage.clickGiftIdeas();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 4)
    public void testClickOnCustomerService() {
        homePage.clickCustomerService();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 5)
    public void testClickOnTodaysDeals() {
        homePage.clickTodaysDeals();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 6)
    public void testClickOnNewReleases() {
        homePage.clickNewReleases();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 7)
    public void testClickOnBooks() {
        homePage.clickBooks();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 8)
    public void testClickOnToysAndGames() {
        homePage.clickToysAndGames();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 9)
    public void testClickOnPCVideoGames() {
        homePage.clickPcVideoGames();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 10)
    public void testClickOnVouchers() {
        homePage.clickVouchers();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 11)
    public void testClickOnPc() {
        homePage.clickPC();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 12)
    public void testClickOnGiftCardsAndTopUp() {
        homePage.clickGiftCardsAndTopUp();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test(priority = 13)
    public void testClickOnMusic() {
        homePage.clickMusic();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 14)
    public void testClickOnFashion() {
        homePage.clickFashion();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 15)
    public void testClickOnHomeAndGarden() {
        homePage.clickHomeAndGarden();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 16)
    public void testClickOnElectronics() {
        homePage.clickElectronics();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 17)
    public void testClickOnBeauty() {
        homePage.clickBeauty();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 18)
    public void testClickOnHealthAndPersonalCare() {
        homePage.clickHealthAndPersonalCare();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 19)
    public void testClickOnPetSupplies() {
        homePage.clickPetSupplies();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 20)
    public void testClickOnSportsAndOutdoors() {
        homePage.clickSportsAndOutdoors();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 21)
    public void testClickOnCarAndMotorbike() {
        homePage.clickCarAndMotorbike();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 22)
    public void testClickOnBaby() {
        homePage.clickBaby();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 23)
    public void testClickOnKindleBooks() {
        homePage.clickKindleBooks();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 24)
    public void testClickOnShopperToolkit() {
        homePage.clickShopperToolkit();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 25)
    public void testClickOnSubscribeAndSave() {
        homePage.clickSubscribeAndSave();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 26)
    public void testClickOnSellOnAmazon() {
        homePage.clickSellOnAmazon();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }

    @Test (priority = 27)
    public void testClickOnDisabilityCustomerSupport() {
        homePage.clickDisabilityCustomerSupport();
        String window = getWindowManager().getTitle();
        System.out.println("New page is: [" + window + "]");

    }


}
