package cucumber_Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/java/features", 
			glue = "stepDefinitionsFramework")

public class TestRunner extends AbstractTestNGCucumberTests{

}
