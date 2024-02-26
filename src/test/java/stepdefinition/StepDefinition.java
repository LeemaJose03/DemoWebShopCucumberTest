package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	public WebDriver driver;
	
	@Given("Open the browser")
	public void open_browser() {
		
		driver = new ChromeDriver();
	}
	
	@And("Launch the URL")
	public void launch_URL() {
		
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@When("Click on Login")
	public void click_login() {
		
		driver.findElement(By.className("ico-login")).click();
		
	}
	
	@And("Enter valid mail as (.*)$")
	public void enter_mail(String mail) {
		
		driver.findElement(By.id("Email")).sendKeys(mail);
		
	}
	
	@And("Enter valid password as (.*)$")
	public void enter_password(String password) {
		
		driver.findElement(By.id("Password")).sendKeys(password);
	}
	
	@And("Click on Login button")
	public void click_loginbutton() {
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	@Then("HomePage should be displayed")
	public void verify() {
		
		System.out.println("Login success");
	}
}



















