package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph_obj {

    WebDriver driver = BaseClass.setDriver();

    @FindBy (xpath = "//a[@href='graph']") WebElement clickGraph;
    @FindBy (xpath = "//a[@href='graph' and text()='Graph']") WebElement linkGrph;
    @FindBy (xpath = "//a[@href='/tryEditor']") WebElement scroll;

    @FindBy (xpath = "//a[text()='Graph Representations']") WebElement graphRep;

    public void graph() {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        clickGraph.click();
    }

    public void grpLink() {
        linkGrph.click();

    }

    public void scrollDown() {
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void tryHereButton() {
        PageFactory.initElements(driver, this);
        scroll.click();
    }

    public void back() {
        PageFactory.initElements(driver, this);
        driver.navigate().back();
    }

    public void graphRepresentations() {
        PageFactory.initElements(driver, this);
        graphRep.click();
    }

    public void scrollUp() {
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
    }


}