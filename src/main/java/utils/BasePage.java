package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void writeText(WebElement element, String inputText) {
        element.sendKeys(inputText);
    }
}
