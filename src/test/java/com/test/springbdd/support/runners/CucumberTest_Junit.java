package com.test.springbdd.support.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"},
		features = "src/test/resources",
        glue = "com.test.springbdd",
        tags = "@SmokeTest",
        monochrome = true,
        publish = true
        
		)
public class CucumberTest_Junit {

}
