package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Login.feature"},
monochrome = true,
dryRun = true
//glue = {"org.stepdef"}

		)
public class TestRunner {

}
//glue = {"org.stepdef"},