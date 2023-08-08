package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Graph_obj;

public class Graph_SD {

    Graph_obj gr = new Graph_obj();

    @Given("User is on home\\/Graph page")
    public void userIsOnHomeGraphPage() throws InterruptedException {
        Thread.sleep(2000);


    }

    @When("User click on Get Started button under Graph")
    public void user_click_on_get_started_button_under_graph() throws InterruptedException {
        Thread.sleep(2000);
        gr.graph();

    }

    @And("User is redirected on Graph page")
    public void user_is_redirected_on_graph_page() throws InterruptedException {
        Thread.sleep(2000);

    }

    @Then("User clicks on Graph link under Topics Covered section")
    public void user_clicks_on_graph_link_under_topics_covered_section() throws InterruptedException {
        Thread.sleep(2000);
        gr.grpLink();

    }

    @Given("User is on Graph Page under Graph section")
    public void user_is_on_graph_page_under_graph_section() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("User scrolls down on the Graph Page")
    public void user_scrolls_down_on_the_graph_page() throws InterruptedException {
        Thread.sleep(2000);
        gr.scrollDown();

    }

    @And("Clicks on Try here button")
    public void clicks_on_try_here_button() throws InterruptedException {
        Thread.sleep(2000);
        gr.tryHereButton();
    }

    @Then("User is redirected on Try Editor")
    public void user_is_redirected_on_try_editor() throws InterruptedException {
        Thread.sleep(2000);
    }

    @And("User goes back on Graph Page")
    public void user_goes_back_on_graph_page() throws InterruptedException {
        Thread.sleep(2000);
        gr.back();
    }

    @Given("User is on Graph Page")
    public void user_is_on_graph_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("User clicks on Graph Representations link on Graph Page")
    public void user_clicks_on_graph_representations_link_on_graph_page() throws InterruptedException {
        Thread.sleep(2000);
        gr.graphRepresentations();
    }

    @And("Scrolls down on the page")
    public void scrolls_down_on_the_page() throws InterruptedException {
        Thread.sleep(2000);
        gr.scrollDown();
        gr.tryHereButton();
        gr.back();
        gr.scrollUp();
    }

    @And("User is on Graph Page page")
    public void user_is_on_graph_page_page() throws InterruptedException {
        Thread.sleep(2000);
        gr.back();
    }

    @When("User clicks on Graph Representation link under Topics covered")
    public void user_clicks_on_graph_representation_link_under_topics_covered() throws InterruptedException {
        Thread.sleep(2000);
        gr.graphRepresentations();
        gr.scrollDown();
        gr.tryHereButton();
        gr.back();
    }

}
