package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchPage {

    @Given("User opens {string} link")
    public void URl(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print("This is the Launch Page " + string);
       // throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on {string} Button")
    public void getStarted(String string) {
        System.out.print(" This is the step 2 " + string );
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @Then("User is redirected to homepage")
    public void homePage() {
        System.out.print(" This is Home Page ");

        // Write code here that turns the phrase above into concrete actions
       //throw new io.cucumber.java.PendingException();
    }
}
