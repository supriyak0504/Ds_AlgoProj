package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage_obj;
import pageObject.PracticeQuestions_obj;
import pageObject.Queue_obj;

public class PracticeQuestions_SD {


    PracticeQuestions_obj prcque = new PracticeQuestions_obj();




    @When("User clicks on Practice Questions")
    public void user_clicks_on_practice_questions() throws InterruptedException {
        Thread.sleep(2000);
        prcque.pracQuestionPage();
    }

    @Then("The Practice Questions Page Opens And User navigates back to queue operations")
    public void the_practice_questions_page_opens_and_user_navigates_back_to_queue_operations() throws InterruptedException {
        Thread.sleep(2000);
        prcque.pracQuestionChk();
    }

    @Then("User clicks on NumpyNinja And Main HomePage Displays")
    public void user_clicks_on_numpy_ninja_And_Main_HomePage_Displays() throws InterruptedException {
        Thread.sleep(2000);
        prcque.NumpyNinjaHome();
    }



}
