package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTool {
    private static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    public static WebElement waitForElementVisibility(By locator, long timeForWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeForWait));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
}
