package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;
import utils.WaitTool;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id='top-links']//li[@class='dropdown']/a")
    private static WebElement myAccountMenu;

    @FindBy(xpath = "//*[@id='top-links']//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a")
    private static WebElement registerOption;

    private static String homePageURL = "http://shop.pragmatic.bg/";

    static {
        PageFactory.initElements(driver, HomePage.class);
    }

    public static void goToHomePage() {
        driver.get(homePageURL);
    }

    public static void clickOnMyAccountMenu() {
        clickOnElement(myAccountMenu);
    }

    public static void clickOnRegisterOption() {
        WaitTool.waitForElementVisibility(By.xpath("//*[@id='top-links']//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a"), 3);
        clickOnElement(registerOption);
    }



}
