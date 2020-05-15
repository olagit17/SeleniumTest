package auto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/HomeUi.feature"}, 
		plugin = {"pretty", "html:target/cucumber-html-reports"},
		monochrome = true,
		glue = {"auto/StepDefinitions.java"}
		)
public class TestRunner {
	
	

}
