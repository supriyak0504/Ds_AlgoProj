package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DataStructureIntroduction_obj;

public class DataStructureIntroduction_SD {

    DataStructureIntroduction_obj ds = new DataStructureIntroduction_obj();

    @Given("User is on Home Page")
    public void user_is_on_home_page() throws InterruptedException {
     Thread.sleep(2000);


    }

    @When("User clicks Get Started on Data Structures-Introduction section")
    public void User_clicks_Get_Started_on_Data_Structures_Introduction() throws InterruptedException {
     Thread.sleep(2000);
     ds.getStarted();

    }

    @Then("User is on {string} page")
    public void User_is_on_Data_Structures_Introduction_page(String string) throws InterruptedException {
     Thread.sleep(2000);

    }

    @When("User scrolls down the page")
    public void User_scrolls_down_the_page() throws InterruptedException {
     Thread.sleep(2000);
     ds.pageDown();

    }

    @And("User clicks on Time Complexity link")
    public void User_clicks_on_Time_Complexity_link() throws InterruptedException {
     Thread.sleep(2000);
     ds.linkTimeComplexity();

    }

    @Then("User is on {string} page and scrolls down page")
    public void User_is_on_Time_Complexity_page_and_scrolls_down_page(String string) throws InterruptedException {
     Thread.sleep(2000);
     ds.pageDown();

    }

    @And("User clicks on {string} box button")
    public void User_clicks_on_Try_here_button(String string) throws InterruptedException {
     Thread.sleep(2000);
     ds.tryHereButton();

    }

    @Then("User goes back on Time Complexity page")
    public void User_goes_back_on_Time_Complexity_page() throws InterruptedException {
     Thread.sleep(2000);
     ds.backwards();

    }

    @When("User clicks on Practice Questions link")
    public void User_clicks_on_Practice_Questions_link() throws InterruptedException {
     Thread.sleep(2000);
     ds.practiceQuestions();

    }

    @And("User is redirected on {string} page")
    public void User_is_redirected_on_Practice_Questions_page(String string) throws InterruptedException {
     Thread.sleep(2000);

    }

    @Then("User goes back on Data Structures-Introduction\\/Time Complexity page")
    public void User_goes_back_on_Data_Structures_Introduction_Time_Complexity_page()  throws InterruptedException {
        Thread.sleep(2000);
        ds.backwards();
        ds.backwards();
        ds.backwards();

    }

}