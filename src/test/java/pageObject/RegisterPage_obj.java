package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertTrue;

public class RegisterPage_obj {

    WebDriver driver = BaseClass.setDriver();

    @FindBy (xpath = "//a[@href='/register']") WebElement registerBtn;

    @FindBy (xpath = "//input[@id='id_username']") WebElement userName;

    @FindBy (xpath = "//input[@id='id_password1']") WebElement passWord;

    @FindBy (xpath = "//input[@id='id_password2']") WebElement confirmPassword;

    @FindBy (xpath = "//input[@value='Register']") WebElement clickButton;

    @FindBy (xpath = "//div[@role='alert']") WebElement registerMessage;


    public void clickRegister() {
        PageFactory.initElements(driver, this);
        registerBtn.click();
    }

    public void inputCredentials(String Username, String Password, String PasswordConfirmation) {
        userName.sendKeys(Username);
        passWord.sendKeys(Password);
        confirmPassword.sendKeys(PasswordConfirmation);

    }
    public void registerButton() {
        PageFactory.initElements(driver, this);
        clickButton.click();

    }

    public void confirmRegistration() {
        boolean status = registerMessage.isDisplayed();
        assertTrue(status);


    }


}
