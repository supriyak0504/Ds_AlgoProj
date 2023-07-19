package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Supriya {


    @Given("The home page opens with the link {string}")
    public void the_home_page_opens_with_the_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.print(" This is home page ");
       // throw new io.cucumber.java.PendingException();
    }

    @When("user clicks get started without registration")
    public void user_clicks_get_started_without_registration() {
        System.out.print(" This is the step 2 " );
        // Write code here that turns the phrase above into concrete actions
     //   throw new io.cucumber.java.PendingException();
    }
    @Then("user is redirected to home page")
    public void user_is_redirected_to_home_page() {
        System.out.print(" This is step 3 ");

        // Write code here that turns the phrase above into concrete actions
       //throw new io.cucumber.java.PendingException();
    }
}
