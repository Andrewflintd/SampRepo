package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FutureFiles/TC-01 Login.feature",
		glue="com.stepdefinition"
		)

public class TestRunner {

}
