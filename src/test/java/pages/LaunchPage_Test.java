package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LaunchPage_Test {


    public static WebDriver driver = new ChromeDriver();
    String URL = "https://dsportalapp.herokuapp.com/";

    @BeforeTest
    public void launchBrowser()
    {
        System.out.println("Launching Ds_ALgo");
    }
    @FindBy (xpath = "//button[text()='Get Started']") WebElement startButton;

    @Test
    public void launch() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get(URL);

        PageFactory.initElements(driver, this);

        startButton.click();
        Thread.sleep(5000);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }



}
