package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   // for junit
@CucumberOptions(features = "src/test/java/feature/Login.feature",
				glue = "stepdefinition" , publish = true)
public class Runner {


}
