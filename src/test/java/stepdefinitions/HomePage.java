package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {

    @Given("User is on Home Page")
    public void homePage() {
        System.out.println("User is on Home Page");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on {string} Button without login")
    public void clickButton(String string) {
        System.out.printf("Clicking on" + string);
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User sees alert {string}")
    public void singInWarning(String string) {
        System.out.println("No access to page Warning saying" + string);
        //throw new io.cucumber.java.PendingException();
    }

    @Given("User is on Main Page")
    public void homePageAccess() {
        System.out.println("User is on Main Page");
        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on dropdown menu without login")
    public void dropDownMenu() {
        System.out.println("Accessing by Clicking dropdown menu");
        //throw new io.cucumber.java.PendingException();
    }
    @And("User clicks on all the options in the dropdown menu without login")
    public void menuDropDown() {
        System.out.println("User is accessing options in dropdown menu");
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User sees warning {string}")
    public void warningMessage(String string) {
        System.out.println("The warning you see" + string);
        //throw new io.cucumber.java.PendingException();
    }



}
