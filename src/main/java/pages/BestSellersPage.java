package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestSellersPage {

    private WebDriver driver;

    public BestSellersPage(WebDriver driver) {
        this.driver = driver;
    }

    private By travelAndHolidayFilter = By.xpath("//a[@href='/Best-Sellers-Books-Travel-Tourism/zgbs/books/83/ref=zg_bs_nav_books_1']");
    //private By heading = By.xpath("//h1[@class='a-size-large a-spacing-medium a-text-bold']");
    private By bannerText = By.id("zg_banner_text");
    private By bannerSubText = By.id("zg_banner_subtext");
    private By numberOne = By.name("#1");


    public void filterByTravelAndHoliday(){
        driver.findElement(travelAndHolidayFilter).click();
    }
    public String getBannerText(){
        return driver.findElement(bannerText).getText();
    }
    public String getBannerSubText(){
        return driver.findElement(bannerSubText).getText();
    }

    public void countCarouselsOnPage(){
        List<WebElement> carousels = driver.findElements(By.xpath("//h2[@class='a-carousel-heading a-inline-block']"));
        System.out.println("The total carousels on page are: " + carousels.size());
    }
    
}
