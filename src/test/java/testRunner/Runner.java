package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"S:/Education-Selenium SDET/intellij/IntellijPrograms/ProjectSetUp/src/test/java/features"},
        glue = {"stepDefinition"},
        monochrome = true,
        plugin = {
                "pretty", "html:src/test/resources/Reports/qualitypiratesReport.html"

        }
)
public  class Runner extends AbstractTestNGCucumberTests {

}