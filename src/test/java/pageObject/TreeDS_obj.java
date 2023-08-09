package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TreeDS_obj {

    @FindBy(xpath = "//a[@href='tree']")
    WebElement TreeGetStartedBtn;
    @FindBy(xpath = "//h4[text()='Tree']")
    WebElement TreeGetStartedMsg;
    @FindBy(xpath = "//a[@href='overview-of-trees']")
    WebElement OvTreeBtn;
    @FindBy(xpath = "//p[text()='Overview of Trees']")
    WebElement OvTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/terminologies/']")
    WebElement TermBtn;
    @FindBy(xpath = "//p[text()='Terminologies']")
    WebElement TermMsg;
    @FindBy(xpath = "//a[@href='/tree/types-of-trees/']")
    WebElement TypeTreesBtn;
    @FindBy(xpath = "//p[text()='Types of Trees']")
    WebElement TypeTreesMsg;
    @FindBy(xpath = "//a[@href='/tree/tree-traversals/']")
    WebElement TreeTravBtn;
    @FindBy(xpath = "//p[text()='Tree Traversals']")
    WebElement TreeTravMsg;
    @FindBy(xpath = "//a[@href='/tree/traversals-illustration/']")
    WebElement TreeTravIllBtn;
    @FindBy(xpath = "//p[text()='Traversals-Illustration']")
    WebElement TreeTravIllMsg;
    @FindBy(xpath = "//a[@href='/tree/binary-trees/']")
    WebElement BinTreeBtn;
    @FindBy(xpath = "//p[text()='Binary Trees']")
    WebElement BinTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/types-of-binary-trees/']")
    WebElement TypeBinTreeBtn;
    @FindBy(xpath = "//p[text()='Types of Binary Trees']")
    WebElement TypeBinTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/implementation-in-python/']")
    WebElement ImplPythTreeBtn;
    @FindBy(xpath = "//p[text()='Implementation in Python']")
    WebElement ImplPythTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/binary-tree-traversals/']")
    WebElement BinTreeTravBtn;
    @FindBy(xpath = "//p[text()='Binary Tree Traversals']")
    WebElement BinTreeTravMsg;
    @FindBy(xpath = "//a[@href='/tree/implementation-of-binary-trees/']")
    WebElement ImplBinTreeBtn;
    @FindBy(xpath = "//p[text()='Implementation of Binary Trees']")
    WebElement ImplBinTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/applications-of-binary-trees/']")
    WebElement AppliBinTreeBtn;
    @FindBy(xpath = "//p[text()='Applications of Binary trees']")
    WebElement AppliBinTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/binary-search-trees/']")
    WebElement BinSearchTreeBtn;
    @FindBy(xpath = "//p[text()='Binary Search Trees']")
    WebElement BinSearchTreeMsg;
    @FindBy(xpath = "//a[@href='/tree/implementation-of-bst/']")
    WebElement ImplBSTBtn;
    @FindBy(xpath = "//p[text()='Implementation Of BST']")
    WebElement ImplBSTMsg;
    @FindBy(xpath = "//a[@href='/tryEditor']")
    WebElement TryHereBtn;


    WebDriver driver = BaseClass.setDriver();
    Boolean status;

    public void LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public void TreeGetStarted() {
        PageFactory.initElements(driver, this);
        TreeGetStartedBtn.click();
    }

    public void TreeLandpageChk() {
        status = TreeGetStartedMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void OverTreeLink() {
        PageFactory.initElements(driver, this);
        OvTreeBtn.click();
    }

    public void OverTreeLinkChk() {
        status = OvTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void Termlink() {
        PageFactory.initElements(driver, this);
        TermBtn.click();
    }

    public void TermlinkChk() {
        status = TermMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void TypesofTreeLink() {
        PageFactory.initElements(driver, this);
        TypeTreesBtn.click();
    }

    public void TypesofTreeMsg() {
        status = TypeTreesMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void TreeTraverseLink() {
        PageFactory.initElements(driver, this);
        TreeTravBtn.click();
    }

    public void TreeTraverseMsg() {
        status = TreeTravMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void TraverseIllLink() {
        PageFactory.initElements(driver, this);
        TreeTravIllBtn.click();
    }

    public void TraverseIllMsg() {
        status = TreeTravIllMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void BinaryTreeLink() {
        PageFactory.initElements(driver, this);
        BinTreeBtn.click();
    }

    public void BinaryTreeMSg() {
        status = BinTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void TypesBinaryTreeLink() {
        PageFactory.initElements(driver, this);
        TypeBinTreeBtn.click();
    }

    public void TypesBinaryTreeMsg() {
        status = TypeBinTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void ImplinPythonTreeLink() {
        PageFactory.initElements(driver, this);
        ImplPythTreeBtn.click();
    }

    public void ImplinPythonTreeMsg() {
        status = ImplPythTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }


    public void BinTreeTravLink() {
        PageFactory.initElements(driver, this);
        BinTreeTravBtn.click();
    }

    public void BinTreeTravMsg() {
        status = BinTreeTravMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void ImplofBinTreesLink() {
        PageFactory.initElements(driver, this);
        ImplBinTreeBtn.click();
    }

    public void ImplofBinTreesMsg() {
        status = ImplBinTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void AppofBinTreesLink() {
        PageFactory.initElements(driver, this);
        AppliBinTreeBtn.click();
    }

    public void AppofBinTreesMsg() {
        status = AppliBinTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }


    public void SearchBinTreesLink() {
        PageFactory.initElements(driver, this);
        BinSearchTreeBtn.click();
    }

    public void SearchBinTreesMsg() {
        status = BinSearchTreeMsg.isDisplayed();
        Assert.assertTrue(status);
    }

    public void ImplBSTLink() {
        PageFactory.initElements(driver, this);
        ImplBSTBtn.click();
    }

    public void ImplBSTMsg() {
        status = ImplBSTMsg.isDisplayed();
        Assert.assertTrue(status);
    }
}
