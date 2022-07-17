package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefination",
		stepNotifications = true,
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/Html_Reports/cucumber.html", "json:target/JSON_Reports/cucumber.json", "junit:target/Junit_Reports/cucumber.xml"})
		
public class TestRunnerJunitTest {

}

		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	plugin = {"pretty", "html:target/Html_Reports/cucumber.html", "json:target/JSON_Reports/cucumber.json", "junit:target/Junit_Reports/cucumber.xml",
	//			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	//	"rerun:target/Failed_Scenario.txt"})