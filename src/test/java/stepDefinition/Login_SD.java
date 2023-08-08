package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObject.Login_obj;

import java.util.List;

import static baseDriverProperty.BaseClass.driver;


public class Login_SD {

      Login_obj lp = new Login_obj();

        @Given("User clicks on sign in option")
        public void user_clicks_on_sign_in_option() throws InterruptedException {
            Thread.sleep(2000);
            lp.SigninPage();

        }

        @When("The user enters the {string} and {string}")
        public void the_user_enters_the_username_and_password(String username, String password) throws InterruptedException {
            Thread.sleep(2000);
            lp.InputSigninData(username, password);

        }

        @Then("The signed in homepage appears")
        public void the_signed_in_homepage_appears() {
            lp.CheckSignin();

        }

}
