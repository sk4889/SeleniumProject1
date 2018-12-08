package com.testing.lob.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Features"}, glue={"com.testing.lob.GlueCode"},
		format = { "usage", "html:target/cucumber-reports" }, 
		//format = { "pretty", "html:target/cucumber-reports" }
		//format = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		monochrome = true,
		tags={"@skip_scenario"}
		)
public class RunnerClass {
	
	
	}

