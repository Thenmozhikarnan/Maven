 package org.runner;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

protected static WebDriver driver;

	public static void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public  static void loadUrl(String Url) {
		driver.get(Url);

	}
	
	//private WebElement ExplicityWait(String name) {
	//	WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(name)));
		//return element;
	//}
	

	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static void close() {
		driver.close();

	}

	public void quit() {
		driver.quit();

	}


	public WebElement byName( String data) {
		WebElement txtpass = driver.findElement(By.name(data));
		return txtpass;
	}
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public WebElement ById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;

	}
	
	
	

	public WebElement btnlogin(String data) {
		WebElement login = driver.findElement(By.name("login"));

		return login;

	}
	public void SelectByIndex(WebElement location,int index) {
		
		Select select=new Select(location);
		select.selectByIndex(index);
	}
	


	public String getText(WebElement element) {
		String data = element.getText();
		return data;

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getCurrentUrl() {
		String title = driver.getCurrentUrl();
		return title;
	}
	

	public String getAttribute(WebElement element) {
		String data = element.getAttribute("value");
		return data;

	}
	public String getAttribute(String value) {
		String data = getAttribute("value");
		return data;
	}
		public void alertok() {
			Alert al=driver.switchTo().alert();
			al.accept();
		}
		
		public void assertEquals(String msg,String actual,String exp) {
			Assert.assertEquals(msg, actual, exp);
			
		}
	public void assertTrue() {
		String currentUrl = getCurrentUrl();
		boolean b = currentUrl.contains("login");
		Assert.assertTrue("verify url", b);
	}
	
	
	
	public void SelectVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public void selectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public WebElement Xpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;
	}

	public void typeJs(WebElement element, String data) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].setAttribute('value'," + data + "),element");
	}

	public void Navigate(String data) {
		Navigation nav = driver.navigate();
		nav.to("data");
	}

	public List<WebElement> getAllSelectedOption(WebElement element, String data) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirst(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public String getFirstSelectionOption(WebElement element, String data) {

		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String st = firstSelectedOption.getAttribute(data);
		return st;
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public boolean isMutiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;

	}

	public void deselectByValue(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByValue(data);

	}

	public void deSelectByVisibleText(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByVisibleText(data);

	}

	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public List<WebElement> table(WebElement element, String Data) {
		WebElement tabledata = driver.findElement(By.id(Data));
		List<WebElement> row = tabledata.findElements(By.tagName(Data));
		return row;
	}

	public void frame(String data) {
		driver.switchTo().frame(data);

	}

	public void window(String data) {
		driver.switchTo().window(data);

	}

	public String getWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}

	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void Dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void jsclick() {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("argument[0].click()");
	}

	


}

