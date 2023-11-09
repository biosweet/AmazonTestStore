package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By cookieAccept = By.xpath("//input[@id='sp-cc-accept']");
    private By searchField = By.id("twotabsearchtextbox");
    private By dismissLocation = By.xpath("//input[@data-action-type='DISMISS']");
    private By dropdown = By.xpath("//select[@aria-describedby='searchDropdownDescription']");
    private By logo = By.id("nav-logo-sprites");
    private By shoppingCart = By.id("nav-cart");
    private By shoppingCartCount = By.id("nav-cart-count");
    private By currencyNav = By.id("icp-nav-flyout");
    private By boxCurrency = By.xpath("//div[@id='nav-flyout-icp'] //div[starts-with(@class,'nav-template')]");
    private By currencyNavHeading = By.xpath("//span[text()='Change currency ']");
    private By currencyNavLearnMoreLink = By.xpath("//a[text()='Learn more']");
    private By navAccount = By.id("nav-link-accountList");
    private By boxAccount = By.xpath("//div[@id='nav-flyout-accountList']  //div[starts-with(@class,'nav-template')]");
    private By flyoutSignIn = By.xpath("//div[@class='nav-signin-tt nav-flyout']");



    public void acceptCookies() {
        driver.findElement(cookieAccept).click();
    }

    public void setDismissLocation() {
        driver.findElement(dismissLocation).click();
    }

    public void setSearch(String text) {
        driver.findElement(searchField).sendKeys(text);
    }

    public void clearSearch() {
        driver.findElement(searchField).clear();
    }


    //method to select the dropdown
    public void selectFromDropDown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    //method to find the dropdown
    private Select findDropdownElement() {
        Select dropdownElement = new Select(driver.findElement(dropdown));
        return dropdownElement;
        //return new Select(driver.findElement(dropdown));
    }

    //method to show and list the selected one option
    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    //method to get all the list off options presented in the dropdown
    public List<String> getAllOptions() {
        List<WebElement> allElements = findDropdownElement().getOptions();
        return allElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    //End of dropdown methods
    //---------------------------------


    public String checkLogo() {
        return driver.findElement(logo).getAriaRole();
    }

    public void checkShoppingCart() {
        driver.findElement(shoppingCart).click();
    }

    public String getShoppingCartItems() {
        return driver.findElement(shoppingCartCount).getText();
    }

    //--------------------------------------
    //following are the links to other pages
    public BestSellersPage clickBestSellerPage() {
        driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
        return new BestSellersPage(driver);
    }

    //--------------------------------------
    //following are the links to other subpages
    public HamburgerMenuOnHomePage getHamburgerMenu(){
        driver.findElement(By.id("nav-hamburger-menu")).click();
        return new HamburgerMenuOnHomePage(driver);
    }



    //following are the links to navbar shopping

    private void shopLink(String XpathLink){
        driver.findElement(By.xpath(XpathLink)).click();
    }

    public void clickBestSellers(){
        shopLink("//a[text()='Best Sellers']");
    }
    public void clickGiftIdeas(){
        shopLink("//a[text()='Gift Ideas\t']");
    }
    public void clickMusic(){
        shopLink("//a[text()='Music']");
    }
    public void clickCustomerService(){

        shopLink("//a[text()='Customer Service']");
    }
    public void clickTodaysDeals(){
        shopLink("//a[contains(@href,'/gp/deals?ref_=nav_cs_gb')]");
    }
    public void clickNewReleases(){
        shopLink("//a[text()='New Releases']");
    }
    public void clickBooks(){
        shopLink("//a[text()='Books']");
    }
    public void clickToysAndGames(){
        shopLink("//a[text()='Toys & Games']");
    }
    public void clickPcVideoGames(){
        shopLink("//a[text()='PC & Video Games']");
    }
    public void clickVouchers(){
        shopLink("//a[text()='Vouchers']");
    }
    public void clickPC(){
        waitFlyout();
        shopLink("//a[text()='PC']");
    }
    public void clickGiftCardsAndTopUp(){
        waitFlyout();
        shopLink("//a[text()='Gift Cards & Top Up']");
    }
    public void clickFashion(){
        waitFlyout();
        shopLink("//a[text()='Fashion']");
    }
    public void clickHomeAndGarden(){
        waitFlyout();
        shopLink("//a[text()='Home & Garden']");
    }
    public void clickElectronics(){
        waitFlyout();
        shopLink("//a[text()='Electronics']");
    }
    public void clickBeauty(){
        waitFlyout();
        shopLink("//a[text()='Beauty']");
    }

    private void waitFlyout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(55));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(flyoutSignIn)));
    }

    public void clickHealthAndPersonalCare(){
        shopLink("//a[text()='Health & Personal Care']");
    }
    public void clickPetSupplies(){
        shopLink("//a[text()='Pet Supplies']");
    }
    public void clickSportsAndOutdoors(){
        shopLink("//a[text()='Sports & Outdoors']");
    }
    public void clickCarAndMotorbike(){
        shopLink("//a[text()='Car & Motorbike']");
    }
    public void clickBaby(){
        shopLink("//a[text()='Baby']");
    }
    public void clickKindleBooks(){
        shopLink("//a[text()='Kindle Books']");
    }
    public void clickShopperToolkit(){
        shopLink("//a[text()='Shopper Toolkit']");
    }
    public void clickSubscribeAndSave(){
        shopLink("//a[text()='Subscribe & Save']");
    }
    public void clickSellOnAmazon(){
        shopLink("//a[text()='Sell on Amazon']");
    }
    public void clickDisabilityCustomerSupport(){
        shopLink("Disability Customer Support");
    }

    //count links on navbar shopping

    public void countLinksNavbarShopping(){
        List<WebElement> links = driver.findElements(By.cssSelector("#nav-xshop a"));
        System.out.println("Shopping links on second level navbar are " + links.size());
    }











    public CurrencyNavBar hoverOverLanguage() {
        WebElement languageFlag = driver.findElement(currencyNav);
        Actions hover = new Actions(driver);
        hover.moveToElement(languageFlag).perform();
        return new CurrencyNavBar(languageFlag.findElement(boxCurrency));
    }

    public Account hoverOverNavAccount() {
        WebElement navAccountAndLists = driver.findElement(navAccount);
        Actions hover = new Actions(driver);
        hover.moveToElement(navAccountAndLists).perform();
        return new Account(navAccountAndLists.findElement(boxAccount));
    }



    public class CurrencyNavBar {

        private WebElement caption;

        public CurrencyNavBar(WebElement caption) {
            this.caption = caption;
        }

        private By currencyNavHeading = By.xpath("//span[text()='Change currency ']");
        private By currencyNavLearnMoreLink = By.xpath("//a[text()='Learn more']");

        public String getTitle() {
            return caption.findElement(currencyNavHeading).getText();
        }

        public String getLinkText() {
            return caption.findElement(currencyNavLearnMoreLink).getText();
        }

        public String getLink() {
            return caption.findElement(currencyNavLearnMoreLink).getAttribute("href");
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }
    }

    public class Account {

        private WebElement caption;

        public Account(WebElement caption) {
            this.caption = caption;
        }

        private By signInButton = By.cssSelector("#nav-flyout-ya-signin span");
        private By newCustomer = By.id("nav-flyout-ya-newCust");
        private By yourLists = By.id("nav-al-title");
        private By yourAccount = By.id("nav-al-your-account");
        private By yourListElements = By.xpath("//div[@id='nav-al-wishlist'] //a");
        private By yourAccountLinks = By.cssSelector("#nav-al-your-account a");




        public String signInButtonText(){
            return driver.findElement(signInButton).getText();
        }

        public String getYourListsText(){
            return driver.findElement(yourLists).getText();
        }

        public void countLinksYourLists(){
            List<WebElement> links = driver.findElements(yourListElements);
            System.out.println("The links under Your Lists are: " + links.size());
        }
        public void countYourAccountLinks(){
            List<WebElement> links = driver.findElements(yourAccountLinks);
            System.out.println("Your Account has number of links: " + links.size());
        }

        //Method to open the wish lists links
        private void openWishListLink(String xpathLink){
            driver.findElement(By.xpath(xpathLink)).click();
        }

        //Here we have the Wish Lists Links
        public void openFindAGiftLink(){
            openWishListLink("//span[text()='Find a Gift']");
        }
        public void openCreateAListLink(){
            openWishListLink("//span[text()='Create a List']");
        }
        public void openSaveItemsFromTheWebLink(){
            openWishListLink("//span[text()='Save Items from the Web']");
        }
        public void openWeddingList(){
            openWishListLink("//span[text()='Wedding List']");
        }
        public void openBabyWishList(){
            openWishListLink("//span[text()='Baby Wishlist']");
        }
        public void openDiscoverYourStyleLink(){
            openWishListLink("//span[text()='Discover Your Style']");
        }
        public void openExploreShowRoomLink(){
            openWishListLink("//span[text()='Explore Showroom']");
        }

        //Method to open Your Items Link
        private void openYourItemsLink(String xpathLink){
            driver.findElement(By.xpath(xpathLink)).click();
        }

        //Here we have Your Items Links
        public void openYourAccountLink(){
            openYourItemsLink("//span[text()='Your Account']");
        }
        public void openYourOrdersLink(){
            openYourItemsLink("//span[text()='Your Orders']");
        }



    }


}



