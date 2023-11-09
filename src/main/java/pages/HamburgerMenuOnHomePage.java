package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HamburgerMenuOnHomePage {

    private WebDriver driver;

    public HamburgerMenuOnHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By hamburgerMenu = By.id("nav-hamburger-menu");
    private By hamburgerMenuLinks = By.xpath("//a[@class='hmenu-item']//div");
    private By primeVideoLink = By.xpath("//a[@class='hmenu-item']//div[1]");
    private By mainMenuBack = By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX'] //a[@class='hmenu-item hmenu-back-button']");


    public void countHamburgerMenuLinks(){
        List<WebElement> links = driver.findElements(hamburgerMenuLinks);
        System.out.println("Links available in Hamburger Menu are: " + links.size());
    }
    private void clickOnHamburgerLink(String XpathLink){
        driver.findElement(By.xpath(XpathLink)).click();
    }
    public void clickOnPrimeVideoLink(){
        clickOnHamburgerLink("//a[@class='hmenu-item']//div[1]");
    }
    public void backToMainMenu(){
        driver.findElement(mainMenuBack).click();
    }

}
