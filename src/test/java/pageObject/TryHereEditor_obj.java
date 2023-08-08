package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.LoggerLoad;

public class TryHereEditor_obj {

    boolean status;
    WebDriver driver = BaseClass.setDriver();

    @FindBy(xpath = "//pre[@id='output']")
    WebElement OutputChk;
    @FindBy(xpath = "//form[@id='answer_form']//div//div//div//textarea")
    WebElement Editorbx;

    @FindBy(xpath = "//button[@type='button']")
    WebElement RunBtn;

 /*   public void EditorBoxInput() {
        PageFactory.initElements(driver, this);
        driver.navigate().back();

        //    System.out.println("Run Editor Box");
        //    CursorBtn.click();


        //   System.out.println("after Run Editor Box");
    }*/

    public void EditorBoxInput() {
        PageFactory.initElements(driver, this);

        //    CursorBtn.click();
        Editorbx.sendKeys("a=10\n b=20\nc=a+b\nprint c");

    }

    public void RunBtnclick() {
        PageFactory.initElements(driver, this);
        RunBtn.click();

        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("ERROR: (ALERT BOX DETECTED) - ALERT MSG : " + alertText);
            alert.accept();
            LoggerLoad.error("Error Message Alert Box : " + alertText);
            //driver.navigate().back();
        } catch (Exception e) {
            String opdisplay = OutputChk.getText();
            //     System.out.printf("The output is " + opdisplay);
            LoggerLoad.info("The output value of python code is " + opdisplay);
        }
    }

    public void OutputChkMsg() throws Exception  {
        try {
            status = OutputChk.isDisplayed();
            Assert.assertTrue(status);
            LoggerLoad.info("Assert True in try editor block");

        } catch (AssertionError e) {
            LoggerLoad.error("Assert false in try editor block");
            System.out.println(e.getMessage());
        }
        driver.navigate().back();
    }


}
