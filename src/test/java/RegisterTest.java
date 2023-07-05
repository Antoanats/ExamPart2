import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest{

    @Test
    public void newRegisterTest() {
        HomePage.goToHomePage();
        HomePage.clickOnMyAccountMenu();
        HomePage.clickOnRegisterOption();
        RegisterPage.writeInFirsNameInputField("Antoana");
        RegisterPage.writeInLastNameInputField("Tsenova");
        String email = RegisterPage.generateRandomEmail();
        RegisterPage.writeInEmailAddressInputField(email);
        String telephone = RegisterPage.generateRandomTelephone();
        RegisterPage.writeInTelephoneInputField(telephone);
        RegisterPage.writeInPasswordInputField("parola");
        RegisterPage.writeInPasswordConfirmInputField("parola");
        RegisterPage.clickOnCheckbox();
        RegisterPage.clickOnContinueButton();
        RegisterPage.checkPageTitleAfterRegistration("Your Account Has Been Created!");
    }
}
