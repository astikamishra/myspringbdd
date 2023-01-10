package com.test.springbdd.stepDefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class structured_settlement_e2e {
	
	Logger logger = LoggerFactory.getLogger(structured_settlement_e2e.class);
	
	@When("the user executes structured settlement with a POST request")
	public void the_user_executes_structured_settlement_with_a_post_request() {
		logger.info("e user executes structured settlement with a POST request");
	}
	
	@Then("the user receives structured settlement status code of {int} from endpoint")
	public void the_user_receives_structured_settlement_status_code_of_from_endpoint(Integer int1) {
		logger.info("the user receives structured settlement status code of {int} from endpoint");
	}
	@Then("the user verify structured settlement data in documentDB")
	public void the_user_verify_structured_settlement_data_in_document_db() {
		logger.info("the user verify structured settlement data in documentDB");
	}

}
