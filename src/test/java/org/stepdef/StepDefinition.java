package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User Launch  page on chrome browser")
	public void user_Launch_page_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
	    
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.id("login")).click();
	    
	}

	@Then("user verifies hello thenukarnan is visible or not")
	public void user_verifies_hello_thenukarnan_is_visible_or_not() {
		
		WebElement login = driver.findElement(By.id("username_show"));
		System.out.println(login);
		if(login.equals("Hello thenukarnan")) {
			System.out.println("verified");
			
		}
		else 
			System.out.println("not verified");
	   
	
	
	
	
	driver.quit();
	
	
	
	}
	
	@Then("user verifies home page is visible are not")
	public void user_verifies_home_page_is_visible_are_not() {
	    System.out.println("Invalid user");
	

}
	@Then("book hotel using mandatory field")
	public void book_hotel_using_mandatory_field() {
	WebElement location = driver.findElement(By.id("location"));    
	Select s = new Select(location);
	s.selectByValue("Melbourne");
	Select s1 = new Select(driver.findElement(By.id("room_nos")));
	s1.selectByValue("1");
	Select s2 = new Select(driver.findElement(By.id("adult_room")));
	s2.selectByValue("1");
	
	
	
	
	
}
}