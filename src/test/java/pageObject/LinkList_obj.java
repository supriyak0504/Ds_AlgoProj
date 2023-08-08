package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class LinkList_obj {

    @FindBy(xpath = "//a[@href=\"linked-list\"]") WebElement GetStarted_LinkedList;
    @FindBy(xpath = "//h4[@class=\"bg-secondary text-white\"]") WebElement LinkedListDisplay_WE;

    @FindBy(xpath = "//a[contains(text(),\"Introduction\")]") WebElement Introduction_WE;
    @FindBy(xpath = "//strong//p[@class=\"bg-secondary text-white\"]") WebElement IntroductionDisplay_WE;
    @FindBy(xpath = "//a[@href=\"/linked-list/types-of-linked-list/\"]")WebElement CreatingLinkList_WE;
    @FindBy(xpath = "//strong//p[@class=\"bg-secondary text-white\"]")WebElement CreatingLinkListDisplay_WE;
    @FindBy(xpath = "//a[@href=\"/linked-list/types-of-linked-list/\"]")WebElement TypesOfLinkedList_WE;
    @FindBy(xpath = "//strong//p[@class=\"bg-secondary text-white\"]")WebElement TypesOfLinkedListDisplay_WE;

    @FindBy(xpath = "//a[@href=\"/linked-list/implement-linked-list-in-python/\"]")WebElement ImplementLinkedList_WE;

    @FindBy(xpath = "//div[@class=\"col-sm\"]")WebElement ImplementLinkedListDisplay_WE;

    @FindBy(xpath = "//a[@href=\"/linked-list/traversal/\"]")WebElement Traversal_WE;
    @FindBy(xpath = "//p//strong[text()=\"Traversals(Single pointer and two pointer)\"]")WebElement TraversalDisplay_WE;
    @FindBy(xpath = "//a[@href=\"/linked-list/insertion-in-linked-list/\"]")WebElement Insertion_WE;
    @FindBy(xpath = "//strong[text()=\"Insertion in a Linked List\"]")WebElement InsertionDisplay_WE;
    @FindBy(xpath = "//a[@href=\"/linked-list/deletion-in-linked-list/\"]")WebElement Deletion_WE;
    @FindBy(xpath = "//strong[text()=\"Removing an Item form a Linked List\"]")WebElement DeletionDisplay_WE;
    @FindBy(xpath = "//a[@href=\"/tryEditor\"]")WebElement TryHereButton_WE;
    @FindBy(xpath = "//button[@type=\"button\"]")WebElement RunButton_WE;


    WebDriver driver = BaseClass.setDriver();
    public void InitLinkedListPage(String string) {

        PageFactory.initElements(driver,this);
    }

    public void LinkedList_Home() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        GetStarted_LinkedList.click();
    }
    public void LinkedListDisplay()
    {
        boolean status = LinkedListDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void Introduction() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        Introduction_WE.click();
    }
    public void IntroductionDisplay()
    {
        boolean status = IntroductionDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void IntroductionTryhereButton() throws InterruptedException {
        Thread.sleep(5000);
       PageFactory.initElements(driver, this);
        TryHereButton_WE.click();
    }
    public void IntroductionTryhereCodeBoxDisplay()
    {
        boolean status = RunButton_WE.isDisplayed();
        assertTrue(status);
        driver.navigate().back();
    }

    public void CreatingLinkList() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        CreatingLinkList_WE.click();
    }
    public void CreatingLinkListDisplay()
    {
        boolean status = CreatingLinkListDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void  TypesOfLinkedList() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        TypesOfLinkedList_WE.click();
    }
    public void TypesOfLinkedListDisplay()
    {
        boolean status =  TypesOfLinkedListDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void  ImplementLinkedList() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        ImplementLinkedList_WE.click();
    }
    public void ImplementLinkedListDisplay()
    {
        boolean status =  ImplementLinkedListDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void TraversalPage() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        Traversal_WE.click();
    }
    public void TraversalPageDisplay()
    {
        boolean status =  TraversalDisplay_WE.isDisplayed();
        assertTrue(status);
    }

    public void InsertionPage() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        Insertion_WE.click();
    }
    public void InsertionPageDisplay()
    {
        boolean status =  InsertionDisplay_WE.isDisplayed();
        assertTrue(status);
    }
    public void DeletionPage() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        Deletion_WE.click();
    }
    public void DeletionPageDisplay()
    {
        boolean status =  DeletionDisplay_WE.isDisplayed();
        assertTrue(status);
    }
    public void DeletionTryHereButton(){
        PageFactory.initElements(driver, this);
        TryHereButton_WE.click();
    }
    public void  DeletionTryHereDisplay()
    {
        boolean status =RunButton_WE.isDisplayed();
        assertTrue(status);
        //driver.navigate().back();
    }

    public void DeletionTryhereButton() throws InterruptedException {
        Thread.sleep(5000);
        PageFactory.initElements(driver, this);
        TryHereButton_WE.click();
    }
    public void DeletionTryhereCodeBoxDisplay()
    {
        boolean status = RunButton_WE.isDisplayed();
        assertTrue(status);
        driver.navigate().back();
    }


}
