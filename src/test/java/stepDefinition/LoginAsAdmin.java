package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginAsAdmin {
	
	LoginPage loginPage;

	@Given("User is able to load the application")
		public void user_is_able_to_load_the_application() {
		loginPage = new LoginPage(BrowserFactory.getDriver());
	}   
	
	@When("User enters username as {string} and password as {string} and click on submit button")
		public void user_enters_username_as_and_password_as_and_click_on_submit_button(String username, String password) {
		loginPage.loginToApplication(username, password);
	}
	
	@Then("User should be able to login")
		public void user_should_be_able_to_login() {
		
		Assert.assertTrue(BrowserFactory.getDriver().findElement(By.xpath("//span[normalize-space()='Manage']")).isDisplayed());
	   
	}

}
