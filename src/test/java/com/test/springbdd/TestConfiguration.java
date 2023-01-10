package com.test.springbdd;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBddApplication.class)
public class TestConfiguration {

}
