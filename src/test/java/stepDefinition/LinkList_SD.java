package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LinkList_obj;

public class LinkList_SD {

    LinkList_obj LL = new LinkList_obj();

    @Given("User is on the {string} after logged in.")
    public void user_is_on_the_after_logged_in(String string) {
        System.out.println("User in on Home page after logged in");
    }
    @When("User click on Get Started button of {string}")
    public void user_click_on_get_started_button_of(String string) throws InterruptedException {
    LL.LinkedList_Home();
    }
    @Then("User redirected to Linked List  Page")
    public void user_should_be_directed_to_linked_list_page() {
       LL.LinkedListDisplay();
    }


    @Given("User is on the Linked List page")
    public void user_is_on_the_linked_list_page() {

    }
    @When("User click on Introduction Link")
    public void user_click_on_introduction_link() throws InterruptedException {
        LL.Introduction();
    }
    @Then("User should be directed to {string} Page")
    public void user_should_be_directed_to_page(String string) {

        LL.IntroductionDisplay();
    }

    @Given("User is on the LinkedList page")
    public void user_is_on_the_linkedlist_page() {

    }
    @When("User click on Tryhere button on Introduction Link")
    public void user_click_on_tryhere_button_on_introduction_link() throws InterruptedException {
        LL.IntroductionTryhereButton();
    }
    @Then("User should be directed to TryEditor Page")
    public void user_should_be_directed_to_try_editor_page() {
        LL.IntroductionTryhereCodeBoxDisplay();
    }

    @When("User click on Creating Link List Link")
    public void user_click_on_creating_link_list_link() throws InterruptedException {
        LL.CreatingLinkList();
    }
    @Then("User redirected to {string} Page")
    public void user_redirected_to_page(String string) {
        LL.CreatingLinkListDisplay();
    }

    @Given("User is on the Creating Link List page")
    public void user_is_on_the_creating_link_list_page() {

    }
    @When("User click on Tryhere button on Creating Link List")
    public void user_click_on_tryhere_button_on_creating_link_list() throws InterruptedException {
        LL.IntroductionTryhereButton();
    }
    @Then("User should be directed to Creating Link List")
    public void user_should_be_directed_to_creating_link_list() {
        LL.IntroductionTryhereCodeBoxDisplay();
    }

    @When("User click on Types of Linked List Link")
    public void user_click_on_types_of_linked_list_link() throws InterruptedException {
     LL.TypesOfLinkedList();
    }

    @Then("User redirected to Types of Linked List Page")
    public void user_redirected_to_types_of_linked_list_page() {
    LL.TypesOfLinkedListDisplay();
    }

    @When("User click on Tryhere button on Linked List")
    public void user_click_on_tryhere_button_on_linked_list() throws InterruptedException {
        LL.IntroductionTryhereButton();
    }
    @Then("User should be directed to Linked List")
    public void user_should_be_directed_to_linked_list() {
        LL.IntroductionTryhereCodeBoxDisplay();
    }

    @When("User click on {string} link")
    public void user_click_on_link(String string) throws InterruptedException {
     LL.ImplementLinkedList();
    }
    @Then("User redirected to Implement Linked List in Python page")
    public void user_redirected_to_implement_linked_list_in_python_page() {
        LL.ImplementLinkedListDisplay();

    }
    @When("User click on Traversal link")
    public void user_click_on_traversal_link() throws InterruptedException {
     LL.TraversalPage();
    }
    @Then("User redirected to Traversal page")
    public void user_redirected_to_traversal_page() {
        LL.TraversalPageDisplay();
    }
    @When("User click on Insertion link")
    public void user_click_on_insertion_link() throws InterruptedException {
     LL.InsertionPage();
    }
    @Then("User redirected to Insertion page")
    public void user_redirected_to_insertion_page() {
     LL.InsertionPageDisplay();
    }
    @When("User click on Deletion link")
    public void user_click_on_deletion_link() throws InterruptedException {
       LL.DeletionPage();
    }
    @Then("User redirected to Deletion page")
    public void user_redirected_to_deletion_page() {
        LL.DeletionPageDisplay();
    }

    @When("User click on tryhere button on Deletion Link")
    public void user_click_on_tryhere_button_on_Deletion_link() throws InterruptedException {
       LL.DeletionTryhereButton();
    }
    @Then("User should be redirected to TryEditor Page")
    public void user_should_be_redirected_to_try_editor_page() {

        LL.DeletionTryhereCodeBoxDisplay();
    }


}
