package com.test.springbdd.stepDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinition {
	
	Logger logger = LoggerFactory.getLogger(LoginPageDefinition.class);
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		logger.info("user is on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		logger.info("user enters valid username and password");
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
		logger.info("clicks on login button");
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		logger.info("user is navigated to the home page");
	}
	
	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		logger.info("user enters invalid username and password");
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_invalid_credentials() {
		logger.info("error message is displayed - Invalid Credentials");
	}
	
	

}
