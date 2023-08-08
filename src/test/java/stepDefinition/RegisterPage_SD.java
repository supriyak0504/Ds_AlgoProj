package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RegisterPage_obj;

public class RegisterPage_SD {

    RegisterPage_obj rp = new RegisterPage_obj();


    @When("User clicks on home page button")
    public void user_clicks_on_home_page_button() throws InterruptedException {
        Thread.sleep(2000);
        rp.clickRegister();
    }

    @When("User enters {string} and {string} and {string}")
    public void user_enters_and_and(String userName, String passWord, String confirmPassword) throws InterruptedException {
        Thread.sleep(2000);
        rp.inputCredentials(userName, passWord, confirmPassword);
    }

    @And("User clicks on Register button")
    public void user_clicks_on_Register_button() throws InterruptedException {
        Thread.sleep(2000);
       rp.registerButton();

    }
    @Then("User is Registered and logged in")
    public void user_is_registered_and_logged_in() throws InterruptedException {
        Thread.sleep(2000);
        rp.confirmRegistration();

    }
}
