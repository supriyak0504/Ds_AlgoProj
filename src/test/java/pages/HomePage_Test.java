package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage_Test {

    public static WebDriver driver = new ChromeDriver();
    String URL = "https://dsportalapp.herokuapp.com/home";

    @FindBy (linkText = "data-structures-introduction") WebElement link;

    @Test
    public void homePage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(URL);

        PageFactory.initElements(driver,this);

        link.click();


    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
