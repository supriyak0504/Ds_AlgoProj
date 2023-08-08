package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack_obj {


    @FindBy (xpath = "//a[@href='stack' and text()='Get Started']") WebElement clickStackGetStarted;

    @FindBy (xpath = "//a[text()='Operations in Stack']") WebElement clickOperations;
    @FindBy (xpath = "//a[@href='/tryEditor']") WebElement clickTryHere;

    @FindBy (xpath = "//a[@href='implementation']") WebElement clickImplementation;
    @FindBy (xpath ="//a[@href='stack-applications']") WebElement clickApplications;

    @FindBy (xpath = "//a[@href='/stack/practice']") WebElement stackPractice;

    WebDriver driver = BaseClass.setDriver();


    public void stack() {

        PageFactory.initElements(driver, this);
        clickStackGetStarted.click();
    }

    public void operationsStack() {
        PageFactory.initElements(driver, this);
        clickOperations.click();

    }

    public void scrollDownStack() {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        clickTryHere.click();
    }

    public void backPage() {
        PageFactory.initElements(driver, this);
        driver.navigate().back();
    }

    public void implementation() {
        PageFactory.initElements(driver, this);
        clickImplementation.click();

    }

    public void applications() {
        PageFactory.initElements(driver, this);
        clickApplications.click();

    }

    public void practice() {
        stackPractice.click();
    }
}
