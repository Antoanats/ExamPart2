package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BasePage;
import utils.WaitTool;

public class RegisterPage extends BasePage {
    @FindBy(id = "input-firstname")
    private static WebElement firstNameInputField;

    @FindBy(id = "input-lastname")
    private static WebElement lastNameInputField;

    @FindBy(id = "input-email")
    private static WebElement emailAddressInputFiled;

    @FindBy(id = "input-telephone")
    private static WebElement telephoneInputField;

    @FindBy(id ="input-password")
    private static WebElement passwordInputField;

    @FindBy(id = "input-confirm")
    private static WebElement passwordConfirmInputField;

    @FindBy(xpath = "//*[@class='pull-right']/input[1]")
    private static WebElement checkbox;

    @FindBy(xpath = "//*[@class='pull-right']/input[@class='btn btn-primary']")
    private static WebElement continueButton;

    static {
        PageFactory.initElements(driver, RegisterPage.class);
    }

    public static void writeInFirsNameInputField(String firstName) {
        WaitTool.waitForElementVisibility(By.id("input-firstname"), 3);
        writeText(firstNameInputField, firstName);
    }

    public static void writeInLastNameInputField(String lastName) {
        WaitTool.waitForElementVisibility(By.id("input-lastname"), 3);
        writeText(lastNameInputField, lastName);
    }

    public static String generateRandomEmail() {
        String prefix = RandomStringUtils.randomAlphabetic(7);
        String sufix = RandomStringUtils.randomAlphabetic(5);
        String domain = RandomStringUtils.randomAlphabetic(3);
        String email = prefix + "@" + sufix + "." + domain;
        return email;
    }

    public static void writeInEmailAddressInputField(String email) {
        writeText(emailAddressInputFiled, email);
    }

    public static String generateRandomTelephone() {
        String telephone = RandomStringUtils.randomNumeric(10);
        return telephone;
    }

    public static void writeInTelephoneInputField(String telephone) {
        writeText(telephoneInputField, telephone);
    }

    public static void writeInPasswordInputField(String password) {
        writeText(passwordInputField, password);
    }

    public static void writeInPasswordConfirmInputField(String passwordConfirm) {
        writeText(passwordConfirmInputField, passwordConfirm);
    }

    public static void clickOnCheckbox() {
        clickOnElement(checkbox);
    }

    public static void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public static void checkPageTitleAfterRegistration(String expectedTitle) {
        WaitTool.waitForElementVisibility(By.cssSelector("#content>h1"), 10);
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}
