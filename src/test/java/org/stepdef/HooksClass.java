package org.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.runner.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
@Before

	public void beforeScenario() {

	getDriver();
	loadUrl("https://www.facebook.com/");
	
	}
@After
public void afterScen(Scenario s) {
if(s.isFailed()) {
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[]  screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "a.png");
		
	
}

driver.close();
	
	
}	
	
}
