package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Stack_obj;

public class Stack_SD {

    Stack_obj st = new Stack_obj();


    @Given("User is on home\\/Stack page")
    public void user_is_on_home_stack_page() {

    }
    @When("User clicks on Get Started button under Stack section")
    public void user_clicks_on_get_started_button_under_stack_section() {
        st.stack();

    }
    @Then("User is redirected on Stack page")
    public void user_is_redirected_on_stack_page() {

    }

    @When("User click on Operations in Stack link under Topics Covered section")
    public void user_click_on_operations_in_stack_link_under_topics_covered_section() {
        st.operationsStack();

    }
    @Then("User is redirected on Stack\\/Operations in Stack")
    public void user_is_redirected_on_stack_operations_in_stack() {

    }
    @And("User scrolls down on Operations in Stack page")
    public void user_scrolls_down_on_operations_in_stack_page() {

    }
    @When("User clicks on Try Here button on Operations in Stack page")
    public void user_clicks_on_try_here_button_on_operations_in_stack_page() {
        st.scrollDownStack();

    }
    @Then("User goes back on Operations in Stack page")
    public void user_goes_back_on_operations_in_stack_page() {
        st.backPage();

    }

    @Given("User is on Stack\\/Operations in Stack page")
    public void user_is_on_stack_operations_in_stack_page() {
        st.backPage();

    }

    @When("User clicks on Implementation link under Topics Covered section")
    public void user_clicks_on_implementation_link_under_Topics_Covered_section() {
        st.implementation();

    }

    @Then("User is redirected on Stack\\/Implementation page")
    public void user_is_redirected_on_stack_implementation_page() {

    }
    @When("User clicks on Try Here button on Implementation page")
    public void user_clicks_on_try_here_button_on_implementation_page() {
        st.scrollDownStack();

    }
    @And("User goes back on Implementation page")
    public void user_goes_back_on_implementation_page() {
        st.backPage();

    }

    @Given("User is on Stack page")
    public void user_is_on_stack_page() {
        st.backPage();

    }
    @When("User clicks on Applications link under Topics Covered section")
    public void user_clicks_on_applications_link_under_topics_covered_section() {
        st.applications();


    }
    @Then("User is redirected to Stack\\/Stack-Applications")
    public void user_is_redirected_to_stack_stack_applications() {

    }
    @When("User scrolls down on the Applications page")
    public void user_scrolls_down_on_the_applications_page() {
        st.scrollDownStack();

    }
    @And("User goes back on Stack page")
    public void userGoesBackOnStackPage() {
        st.backPage();


    }

    @Then("User clicks on Operations in Stacks link")
    public void User_clicks_on_Operations_in_Stacks_link() {
        st.operationsStack();

    }

    @When("User clicks on Practice Questions link under Stack section")
    public void User_clicks_on_Practice_Questions_link_under_Stack_section() {
        st.practice();

    }

    @Then("User is redirected on Practice Questions page")
    public void user_is_redirected_on_practice_questions_page() {

    }


    @And("User goes back on Stack Page")
    public void user_Goes_Back_On_Stack_Page() {
        st.backPage();
        st.backPage();
        st.backPage();
    }
}

