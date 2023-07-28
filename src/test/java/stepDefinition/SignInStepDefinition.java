package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.SignIn_PageObject;

import java.net.URL;

public class SignInStepDefinition {
    public WebDriver driver;
    public SignIn_PageObject sp;

    @Given("User able to access Chrome browser")
    public void user_able_to_access_chrome_browser() {
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user") + "//Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        sp = new SignIn_PageObject(driver);
    }
    @When("Registered User open URL {string}")
    public void registered_user_open_url(String url) {
        driver.get(url);
    }
    @When("User click on the Sign in button.")
    public void user_click_on_the_sign_in_button() throws InterruptedException {
        sp.ClickSignIn();
    }
    @When("User enter with valid Username:{string} and password:{string}")
    public void user_enter_with_valid_username_and_password(String uname, String passw) throws InterruptedException {
        sp.SignIn(uname);
        sp.Setpassword(passw);
    }
    @When("User click on Login button")
    public void user_click_on_login_button() {
        sp.LogIn();
    }
    @Then("User will be redirected to the home page")
    public void user_will_be_redirected_to_the_home_page() {
        System.out.println("User Directed to new page");
    }

}









