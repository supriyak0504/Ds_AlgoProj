package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Queue_obj;
import pageObject.TryHereEditor_obj;

public class QueueDs_SD {

Queue_obj qp = new Queue_obj();
TryHereEditor_obj tr = new TryHereEditor_obj();

/* QUEUE LANDING HOMEPAGE*/
    @Given("User is on the SignedIn Home Page")
    public void user_is_on_the_signed_in_home_page() {
    qp.LandingPage();
    }
    @When("User Clicks on {string} button on Queue Data Structure")
    public void user_clicks_on_button_on_queue_data_structure(String string) throws InterruptedException {
        Thread.sleep(2000);
    qp.QueueGStarted();
    }


    @Then("The queue page appears")
    public void the_queue_page_appears() throws InterruptedException {

            Thread.sleep(2000);
            qp.CheckQueLanding();
    }

   /*IMPLEMENTATION OF QUEUES IN PYTHON*/
    @When("User clicks on Implementation of Queue in python")
    public void userClicksOnImplementationOfQueueInPython() throws InterruptedException {
        Thread.sleep(2000);
        qp.ImplofQueuePython();
    }

    @Then("The Implementation of Queue in python page opens")
    public void the_implementation_of_queue_page_opens()throws InterruptedException {
        Thread.sleep(2000);
    qp.implQueuechk();
    }

    @And("User clicks on Try here button")
    public void userClicksOnTryHereButton() throws InterruptedException{
        Thread.sleep(2000);
        qp.TryHereButton();
    }

    /*IMPLEMENTATION USING COLLECTIONS.DEQUEUE*/
   // @Given("User is on Implementation of Queue in python landing page")
  //  public void userIsOnImplementationOfQueueLandingPage()throws InterruptedException {
   //     Thread.sleep(2000);
   //     qp.implQueuechk();
 //   }

    @When("User clicks on implementation using collections.deque")
    public void userClicksOnImplementationUsingCollectionsDeque()throws InterruptedException {
        Thread.sleep(2000);
        qp.implCollections();

    }

    @Then("The implementation using collections.deque page opens")
    public void theImplementationUsingCollectionsDequePageOpens()throws InterruptedException {
        Thread.sleep(2000);
        qp.implCollchk();
    }

//Implementation using array
  //  @Given("User is on implementation using collections.deque landing page")
 //   public void userIsOnImplementationUsingCollectionsDequeLandingPage()throws InterruptedException {
  //      Thread.sleep(2000);
  //      qp.implCollchk();
  //  }

    @When("User clicks on implementation using array")
    public void userClicksOnImplementationUsingArray()throws InterruptedException {
        Thread.sleep(2000);
    qp.implusingarray();
    }

    @Then("The implementation using array page opens")
    public void theImplementationUsingArrayPageOpens()throws InterruptedException {
        Thread.sleep(2000);
    qp.implarraychk();
    }

 //   @Given("User is on implementation using array landing page")
  //  public void userIsOnImplementationUsingArrayLandingPage()throws InterruptedException {
  //      Thread.sleep(2000);
  //  qp.implarraychk();
  //  }

    @When("User clicks on Queue Operations")
    public void userClicksOnQueueOperations()throws InterruptedException {
        Thread.sleep(2000);
    qp.queueops();
    }

    @Then("The Queue Operations page opens")
    public void theQueueOperationsPageOpens()throws InterruptedException {
        Thread.sleep(2000);
        qp.queueopschk();
    }


    //Try python Text editor Options

    @Then("the text editor opens and user gives python code")
    public void theTextEditorOpensAndUserGivesPythonCode() throws InterruptedException {
        Thread.sleep(2000);
        tr.EditorBoxInput();

    }

    @And("User clicks on Run Button")
    public void userClicksOnRunButton() throws InterruptedException {
        Thread.sleep(2000);
        tr.RunBtnclick();
    }

    @Then("The output is displayed")
    public void theOutputIsDisplayed() throws Exception {
        Thread.sleep(2000);
        tr.OutputChkMsg();

    }

}
