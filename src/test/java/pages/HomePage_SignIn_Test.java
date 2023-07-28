package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class HomePage_SignIn_Test {

    public static WebDriver driver = new ChromeDriver();
    String URL = "https://dsportalapp.herokuapp.com/home";

    @FindBy (xpath = "//a[@href = '/login' and text()='Sign in'] ") WebElement signin;
    @FindBy (xpath = "//input[@name = 'username']") WebElement username;
    @FindBy (xpath = "//input[@name = 'password']") WebElement password;
    @FindBy (xpath = "//input[@type = 'submit']") WebElement loginbutton;


    @Test
    public void homePage_SignIn() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(URL);

        PageFactory.initElements(driver,this);

        signin.click();
        username.sendKeys("Quality_Pirates_ds_algo");
        password.sendKeys("ds_algo@2023");
        loginbutton.click();

    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
