package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.time.Duration;

public class Base {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        goHome();
        homePage = new HomePage(driver);
        homePage.acceptCookies();

    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://www.amazon.co.uk/");
    }

    @AfterMethod
    public void takeScreenshot(){
        var camera = (TakesScreenshot)driver;

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }


}
