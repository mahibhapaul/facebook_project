package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lione\\eclipse-workspace\\CucumberFramework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}
}
