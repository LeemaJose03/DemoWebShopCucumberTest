package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/Login.feature",
					glue = "stepdefinition" , publish = true)
public class RunnerwithTestNG extends AbstractTestNGCucumberTests{

}
