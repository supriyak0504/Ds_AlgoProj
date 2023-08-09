package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"C:/intellij/Ds/src/test/resources/features"},
        glue = {"stepDefinition"},
        //tags = "not @ignore",
        plugin = {
                "pretty", "html:src/test/resources/Reports/qualitypiratesReport.html",

        }
)
public  class Runner extends AbstractTestNGCucumberTests {

}
