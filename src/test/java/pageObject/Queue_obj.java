package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Queue_obj {
    boolean status;
    WebDriver driver = BaseClass.setDriver();
    @FindBy(xpath = "//a[@href='queue']")
    WebElement QueueGetStartedBtn;
    @FindBy(xpath = "//h4[text()='Queue']")
    WebElement QueueLPMsg;

    @FindBy(xpath = "//a[@href='implementation-lists']")
    WebElement ImplQueuePythonBtn;
    @FindBy(xpath = "//p[text()='Implementation of Queue in Python']")
    WebElement ImplQueueMsg;
  //  @FindBy(xpath = "//a[@href='/queue/implementation-lists/']")
  //  WebElement ImplCollLink;
    @FindBy(xpath = "//a[@href='/queue/implementation-collections/']")
    WebElement ImplQueueCollBtn;
    @FindBy(xpath = "//p[text()='Implementation using collections.deque']")
    WebElement ImplQueueCollMsg;
    @FindBy(xpath = "//a[@href='/queue/Implementation-array/']")
    WebElement ImplArrayBtn;
    @FindBy(xpath = "//p[text()='Implementation using array']")
    WebElement ImplArrayMsg ;
    @FindBy(xpath = "//a[@href='/queue/QueueOp/']")
    WebElement QueueOpsBtn ;
    @FindBy(xpath = "//p[text()='Queue Operations']")
    WebElement QueueOpsMsg;
    @FindBy(xpath = "//a[@href='/tryEditor']")
    WebElement TryHereBtn;

//    JavascriptExecutor jse = (JavascriptExecutor) driver;

    public void LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public void QueueGStarted() {
        QueueGetStartedBtn.click();
    }

    public void CheckQueLanding() {
        status = QueueLPMsg.isDisplayed();
        Assert.assertTrue(status);
        //    jse.executeScript("window.scrollBy(0,500);");
    }

    //Implementation of Queue Page
    public void ImplofQueuePython() {
        PageFactory.initElements(driver, this);
        ImplQueuePythonBtn.click();
    }

    public void implQueuechk() {
        PageFactory.initElements(driver, this);
        status = ImplQueueMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void implCollections() {
        PageFactory.initElements(driver, this);
        ImplQueueCollBtn.click();
    }

    public void implCollchk() {
        PageFactory.initElements(driver, this);
        status = ImplQueueCollMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void implusingarray()
    {
        PageFactory.initElements(driver, this);
        ImplArrayBtn.click();
    }

    public void implarraychk()
    {
        PageFactory.initElements(driver, this);
        status = ImplArrayMsg.isDisplayed();
        Assert.assertTrue(status);

    }

    public void queueops()
    {
        PageFactory.initElements(driver, this);
        QueueOpsBtn.click();

    }
    public void queueopschk()
    {
        PageFactory.initElements(driver, this);
        status = QueueOpsMsg.isDisplayed();
        Assert.assertTrue(status);

    }

    public void TryHereButton()
    {
        PageFactory.initElements(driver,this);
        TryHereBtn.click();

    }

}
