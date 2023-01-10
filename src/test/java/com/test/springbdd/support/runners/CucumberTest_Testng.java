package com.test.springbdd.support.runners;

import java.io.IOException;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.xml.XmlTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberPropertiesProvider;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"},
		monochrome = true,
		features = "src/test/resources",
        tags = "@SmokeTest",
        glue = "com.test.springbdd",
        publish = true
		)
public class CucumberTest_Testng extends AbstractTestNGCucumberTests{

	Logger logger = LoggerFactory.getLogger(CucumberTest_Testng.class);
	
	@BeforeSuite
	void beforeSuiteExecution(@NotNull ITestContext context) throws IOException {
		
		XmlTest xmlTest = context.getCurrentXmlTest();
		logger.info("Calling beforeSuiteExecution with {}", xmlTest);
		logger.info("Current xml test name : {}", xmlTest!=null ? xmlTest.getName():"Empty");
		/*
		 * CucumberPropertiesProvider properties = xmlTest::getParameter;
		 * logger.info("Properties : {}", properties);
		 */
		
	}
}
