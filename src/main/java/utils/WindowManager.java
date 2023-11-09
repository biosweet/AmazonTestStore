package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void getRefresh(){
        driver.navigate().refresh();
    }

    public String getTitle(){
       return driver.getTitle();
    }
}
