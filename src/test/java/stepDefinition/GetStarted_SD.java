package stepDefinition;

import io.cucumber.java.en.Then;
import pageObject.Home_SetObj;

public class GetStarted_SD {

    Home_SetObj hmp = new Home_SetObj();
    @Then("User clicks on main page Get Started")
    public void user_clicks_on_main_page_get_started() throws InterruptedException {
        hmp.GetStartedBtn_HMPage();
    }

}
