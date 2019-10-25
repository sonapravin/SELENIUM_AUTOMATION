package testCases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleSearch {
	
	@Test
	public void search() {

		
		  File chromeDriver = new File("/home/pravin/git/SELENIUM_AUTOMATION/seleniumProject1/resources/chromedriver_linux64/chromedriver");
		   System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
		  WebDriver driver = new ChromeDriver();
		  driver = new ChromeDriver();
			driver.get("https://www.google.com/");
	}

}
