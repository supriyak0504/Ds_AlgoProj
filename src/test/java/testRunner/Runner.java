package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\numpy project\\dsalgo\\src\\test\\resources\\features",
        glue = "stepDefination")
public class Runner extends AbstractTestNGCucumberTests{

}
