package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TryEditor_obj {
   // @FindBy(xpath = "//span[@class='cm-variable']") WebElement TextBoxCursor;

    @FindBy(xpath = "//button[@type=\"button\"]")WebElement RunButton;

    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement TextEditor;

    WebDriver driver = BaseClass.setDriver();

    public void InitTryEditorPage(String string) {

        PageFactory.initElements(driver,this);
    }

   /*public void Pythoncode1() throws InterruptedException {
        PageFactory.initElements(driver, this);
        Thread.sleep(5000);
        TextEditor.sendKeys("print \"hello\"");

    }*/
  public void Pythoncode(String Code) throws InterruptedException {
       PageFactory.initElements(driver, this);
       Thread.sleep(5000);
       TextEditor.sendKeys(Code);
   }


       public void PythonRun() throws InterruptedException {
        Thread.sleep(2000);
        RunButton.click();

    }

}
