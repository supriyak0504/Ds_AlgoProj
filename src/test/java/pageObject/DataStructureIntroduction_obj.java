package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructureIntroduction_obj {

    WebDriver driver = BaseClass.setDriver();



    @FindBy(xpath = "//a[@href='data-structures-introduction']") WebElement clickButton;

    @FindBy(xpath = "//a[@href='time-complexity']") WebElement clickLinkTC;

    @FindBy(xpath = "//a[@href='/tryEditor']") WebElement clickthb;

    @FindBy(xpath = "//a[text()='Practice Questions']") WebElement clickPrQ;


    public void getStarted() {
        PageFactory.initElements(driver, this);
        clickButton.click();
    }

    public void pageDown() {
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void linkTimeComplexity() {
        PageFactory.initElements(driver, this);
        clickLinkTC.click();
    }

    public void tryHereButton() {
        clickthb.click();

    }


    public void practiceQuestions() {
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
        PageFactory.initElements(driver, this);
        clickPrQ.click();
    }

    public void backwards() {
        PageFactory.initElements(driver, this);
        driver.navigate().back();
    }









}
