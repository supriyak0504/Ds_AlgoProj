package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;
public class Array_obj {

    @FindBy(xpath = "//a[@href=\"array\"]") WebElement GetStarted;
    @FindBy(xpath = "//h4[@class=\"bg-secondary text-white\"]")WebElement DisplayCheck;

    @FindBy(xpath = "//a[@href=\"arrays-in-python\"]")WebElement ArrayInPython;

    @FindBy(xpath = "//div//strong//p[@class=\"bg-secondary text-white\"]")WebElement DisplayCheckArrayInPython;

    @FindBy(xpath = "//a[@href=\"/tryEditor\"]")WebElement TryHereButton;

    @FindBy(xpath = "//a[@href=\"/array/arrays-using-list/\"]") WebElement ArraysUsingListLink;

    @FindBy(xpath = "//div[@class=\"col-sm\"]")WebElement ArraysUsingListDisplay;

    @FindBy(xpath = "//button[@type=\"button\"]")WebElement TryEditorDisplay;

    @FindBy(xpath = "//a[@href=\"/array/basic-operations-in-lists/\"]")WebElement BasicOperationInLists_WE;

    @FindBy(xpath = "//strong//p[@class=\"bg-secondary text-white\"]")WebElement BasicOperationDisplay_WE;

    @FindBy(xpath = "//a[@href=\"/array/applications-of-array/\"]")WebElement ApplicationsOfArray_WE ;

    @FindBy(xpath = "//strong//p[@class=\"bg-secondary text-white\"]")WebElement  ApplicationsOfArrayDisplay_WE;

    @FindBy(xpath = "//a[@class=\"list-group-item list-group-item-light text-info\"]")WebElement PracticeQuestions_WE;

    @FindBy(xpath = "//a[@href=\"/question/1\"]")WebElement PracticeQuestionsDisplay_WE;

    @FindBy(xpath = "//a[@href=\"/question/1\"]")WebElement SearchTheArray_WE;
    @FindBy(xpath = "//button[@type=\"button\"]")WebElement RunButton_WE;

    @FindBy(xpath = "\"//div//form[@id='answer_form']/div/div/div/textarea\"")WebElement TryEditorBox_WE;

    WebDriver driver = BaseClass.setDriver();
    public void InitArrayPage(String string) {

        PageFactory.initElements(driver,this);
    }

    public void GetStartedButton() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        GetStarted.click();
    }
    public void ArrayPageDisplay()
    {
        boolean status = DisplayCheck.isDisplayed();
        assertTrue(status);
    }

    public void ArrayInPythonPage() throws InterruptedException {
        Thread.sleep(2000);
        ArrayInPython.click();
    }

    public void ArrayInPythonPageDisplay()
    {
        boolean status = DisplayCheckArrayInPython.isDisplayed();
        assertTrue(status);
    }

    public void ArrayPythonPageTryhereButton() throws InterruptedException {
        Thread.sleep(2000);
        TryHereButton.click();
    }
    public void ArrayPythonPageTryhereCodeBoxDisplay()
    {
        boolean status = TryEditorDisplay.isDisplayed();
        assertTrue(status);
        driver.navigate().back();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-2500)");

    }

    public void ArraysUsingList() throws InterruptedException {
        Thread.sleep(5000);
        PageFactory.initElements(driver, this);
        ArraysUsingListLink.click();
    }
    public void ArrayUsingDisplay(){
        boolean status = ArraysUsingListDisplay.isDisplayed();
        assertTrue(status);
    }

    public void ArrayUsingListTryhereButton() throws InterruptedException {
        Thread.sleep(2000);
        PageFactory.initElements(driver, this);
        TryHereButton.click();
    }
    public void ArrayUsingListTryhereCodeBoxDisplay()
    {
        boolean status = TryEditorDisplay.isDisplayed();
        assertTrue(status);
        driver.navigate().back();
    }
    public void BasicOperationInLists() throws InterruptedException {
        Thread.sleep(5000);
        PageFactory.initElements(driver, this);
        BasicOperationInLists_WE.click();
    }
    public void BasicOperationDisplay(){
        boolean status = BasicOperationDisplay_WE.isDisplayed();
        assertTrue(status);
    }
    public void BasicOperationTryhereButton() throws InterruptedException {
        Thread.sleep(2000);
        PageFactory.initElements(driver, this);
        TryHereButton.click();
    }
    public void BasicOperationTryhereDisplay()
    {
        boolean status = TryEditorDisplay.isDisplayed();
        assertTrue(status);
        driver.navigate().back();
    }
    public void ApplicationsOfArray() throws InterruptedException {
        Thread.sleep(5000);
        PageFactory.initElements(driver, this);
        ApplicationsOfArray_WE.click();
    }
    public void ApplicationsOfArrayDisplay(){
        boolean status = ApplicationsOfArrayDisplay_WE.isDisplayed();
        assertTrue(status);
    }
    public void ApplicationsOfArrayTryhereButton() throws InterruptedException {
        Thread.sleep(2000);
        PageFactory.initElements(driver, this);
        TryHereButton.click();
    }
    public void ApplicationsOfArrayTryhereDisplay()
    {
        boolean status = TryEditorDisplay.isDisplayed();
        assertTrue(status);
        driver.navigate().back();
    }

    public void PracticeQuestions() throws InterruptedException {
        Thread.sleep(5000);
        PageFactory.initElements(driver, this);
        PracticeQuestions_WE.click();
    }
    public void PracticeQuestionsDisplay(){
        boolean status = PracticeQuestionsDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void SearchTheArrayLink() throws InterruptedException {
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);
        SearchTheArray_WE .click();
    }
    public void SearchTheArrayDisplay(){
        boolean status = RunButton_WE.isDisplayed();
        assertTrue(status);
    }

    public void TryEditorBox(){
        PageFactory.initElements(driver, this);
        TryEditorBox_WE.sendKeys("hello");
    }
    public void RunButton(){
        RunButton_WE.click();
    }


}