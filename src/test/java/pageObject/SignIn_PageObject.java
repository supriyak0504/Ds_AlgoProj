package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignIn_PageObject {
    public WebDriver ldriver;
    public SignIn_PageObject(WebDriver rdriver){

            ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//a[text()='Sign in']") WebElement SignInButton;

    @FindBy(xpath ="[//input[@name='username']") WebElement UserNameButton;

    @FindBy(xpath = "//input[@name='password']")WebElement PassWord;

    @FindBy(xpath="//input[@type=\"submit\"]")WebElement LogInButton;

    public void SignIn(String uname){
        UserNameButton.clear();
        UserNameButton.sendKeys(uname);
    }
    public void ClickSignIn() throws InterruptedException {
        Thread.sleep(2000);
    SignInButton.click();
    }
    public void Setpassword(String passw) throws InterruptedException {
        Thread.sleep(2000);
        PassWord.clear();
        PassWord.sendKeys(passw);
    }
    public void LogIn(){
        LogInButton.click();
    }

}

