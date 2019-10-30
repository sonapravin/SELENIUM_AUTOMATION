package testCases;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleSearch {

	final static 	Logger logger = Logger.getLogger(googleSearch.class);
    //Where is the correct location to put Log4j.properties in an Eclipse project?
	//you can add it any where you want, when you run your project, configure the classpath and add the location of the log4j.properties files by clicking on: Run->Run Configuration -> [classpath tab] -> click on user Entries -> Advanced -> Select Add Folder -> select the location of your log4j.properties file
	
	
	@Test
	public void search() {
		
	
		File chromeDriver = new File(
				"./resources/chromedriver");
		System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		
		logger.info("Opening google.com");
		driver.get("https://www.google.com/");
	}

}
