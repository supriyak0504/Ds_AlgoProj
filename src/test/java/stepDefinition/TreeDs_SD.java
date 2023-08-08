package stepDefinition;

import gherkin.lexer.Th;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TreeDS_obj;

public class TreeDs_SD {

    TreeDS_obj trobj = new TreeDS_obj();
    @Given("User is on the SignedIn Home Page for tree")
    public void user_is_on_the_signed_in_home_page_for_tree() throws InterruptedException {
        Thread.sleep(2000);
        trobj.LandingPage();
    }
    @When("User Clicks on {string} button on tree Data Structure")
    public void userClicksOnButtonOnTreeDataStructure(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        trobj.TreeGetStarted();
    }
    @Then("The Tree page appears")
    public void the_Tree_page_appears() throws InterruptedException {
        Thread.sleep(2000);
      trobj.TreeLandpageChk();
    }

    @When("User clicks on Overview of Trees")
    public void userClicksOnOverviewOfTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.OverTreeLink();
    }

    @Then("The Overview of Trees page opens")
    public void theOverviewOfTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.OverTreeLinkChk();
    }

    @When("User clicks on Terminologies")
    public void userClicksOnTerminologies() throws InterruptedException {
        Thread.sleep(2000);
        trobj.Termlink();
    }

    @Then("The Terminologies page opens")
    public void theTerminologiesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TermlinkChk();
    }

    @When("User clicks on Types of Trees")
    public void userClicksOnTypesOfTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TypesofTreeLink();
    }

    @Then("The Types of Trees page opens")
    public void theTypesOfTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TypesofTreeMsg();
    }

    @When("User clicks on Tree Traversals")
    public void userClicksOnTreeTraversals() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TreeTraverseLink();
    }

    @Then("The Tree Traversals page opens")
    public void theTreeTraversalsPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TreeTraverseMsg();
    }

    @When("User clicks on Traversals-Illustration")
    public void userClicksOnTraversalsIllustration() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TraverseIllLink();
    }

    @Then("The Traversals-Illustration page opens")
    public void theTraversalsIllustrationPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TraverseIllMsg();
    }

    @When("User clicks on Binary Trees")
    public void userClicksOnBinaryTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.BinaryTreeLink();
    }

    @Then("The Binary Trees page opens")
    public void theBinaryTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.BinaryTreeMSg();
    }

    @When("User clicks on Types of Binary Trees")
    public void userClicksOnTypesOfBinaryTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TypesBinaryTreeLink();
    }

    @Then("The Types of Binary Trees page opens")
    public void theTypesOfBinaryTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.TypesBinaryTreeMsg();
    }

    @When("User clicks on Implementation in Python")
    public void userClicksOnImplementationInPython() throws InterruptedException {
        Thread.sleep(2000);
        trobj.ImplinPythonTreeLink();
    }

    @Then("The Implementation in Python page opens")
    public void theImplementationInPythonPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.ImplinPythonTreeMsg();
    }

    @When("User clicks on Binary Tree Traversals")
    public void userClicksOnBinaryTreeTraversals() throws InterruptedException {
        Thread.sleep(2000);
        trobj.BinTreeTravLink();
    }

    @Then("The Binary Tree Traversals page opens")
    public void theBinaryTreeTraversalsPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.BinTreeTravMsg();
    }

    @When("User clicks on Implementation of Binary Trees")
    public void userClicksOnImplementationOfBinaryTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.ImplofBinTreesLink();
    }

    @Then("The Implementation of Binary Trees page opens")
    public void theImplementationOfBinaryTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.ImplofBinTreesMsg();
    }

    @When("User clicks on Applications of Binary trees")
    public void userClicksOnApplicationsOfBinaryTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.AppofBinTreesLink();
    }

    @Then("The Applications of Binary trees page opens")
    public void theApplicationsOfBinaryTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.AppofBinTreesMsg();
    }

    @When("User clicks on Binary Search Trees")
    public void userClicksOnBinarySearchTrees() throws InterruptedException {
        Thread.sleep(2000);
        trobj.SearchBinTreesLink();
    }

    @Then("The Binary Search Trees page opens")
    public void theBinarySearchTreesPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.SearchBinTreesMsg();
    }

    @When("User clicks on Implementation Of BST")
    public void userClicksOnImplementationOfBST() throws InterruptedException {
        Thread.sleep(2000);
        trobj.ImplBSTLink();
    }

    @Then("The Implementation Of BST page opens")
    public void theImplementationOfBSTPageOpens() throws InterruptedException {
        Thread.sleep(2000);
        trobj.ImplBSTMsg();
    }

}
