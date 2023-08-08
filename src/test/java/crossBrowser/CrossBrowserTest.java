package crossBrowser;

import baseDriverProperty.BaseClass;
import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.HomePage_obj;


public class CrossBrowserTest extends BaseClass {
    WebDriver driver = BaseClass.setDriver();
    //WebDriver driver;
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    ChromeOptions chromeOptions = new ChromeOptions();
    EdgeOptions edgeOptions = new EdgeOptions();

    @Parameters("browser")
    @BeforeTest
    public void initialize(String browser){

        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Firefox is launched");
        }
        else if ((browser.equalsIgnoreCase("chrome"))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("ChromeBrowser is launched");
        }
        else if ((browser.equalsIgnoreCase("edge"))){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("EdgeDriver is launched");
        }

    }
   /* @Test
    public void Dsalgo(){
        driver.get("https://dsportalapp.herokuapp.com/");
        String actual = driver.getTitle();
        String expact = "dsportalapp";
        Assert.assertEquals(actual.contains("dsportalapp"), expact.contains("dsportalapp"));
    }
   @AfterTest
    public void endTest(){
        //driver.quit();
    }*/

}
