package testCases;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleSearch {

	final static 	Logger logger = Logger.getLogger(googleSearch.class);
	
	@Test
	public void search() {
		
	
		File chromeDriver = new File(
				"/home/pravin/git/SELENIUM_AUTOMATION/seleniumProject1/resources/chromedriver");
		System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		
		logger.info("Opening google.com");
		driver.get("https://www.google.com/");
	}

}
