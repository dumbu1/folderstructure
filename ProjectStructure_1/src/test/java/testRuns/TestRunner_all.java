package testRuns;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@ExtendedCucumberOptions(
		
		retryCount = 3
		)*/
@RunWith(Cucumber.class)
@CucumberOptions(


		features="src/test/resources/features/dataDrivenTesting/feature1.feature",


		glue = {"stepDefinations","hooks"},

		plugin = {"pretty",


				//for exten reports
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		
		//for running failed testcases
		"rerun:target/failedRerun.txt"
		},
		
		dryRun = true,
		monochrome = true
		)


public class TestRunner_all extends AbstractTestNGCucumberTests {


}
