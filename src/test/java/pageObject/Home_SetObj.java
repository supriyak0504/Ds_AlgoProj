package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_SetObj {

    WebDriver driver = BaseClass.setDriver();
    @FindBy(xpath = "//button[@class='btn']")
    WebElement GetStartedbtn;


    public void GetStartedBtn_HMPage() throws InterruptedException {
        PageFactory.initElements(driver,this);
        Thread.sleep(2000);
        GetStartedbtn.click();

    }
}
