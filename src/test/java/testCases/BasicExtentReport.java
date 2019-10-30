package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasicExtentReport {
	
	//builds a new report using the html template 
    ExtentHtmlReporter htmlReporter;
    
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest logger;

    @BeforeTest
    public void startReport() {
    htmlReporter = new ExtentHtmlReporter("./Output/testReport.html");    
    //initialize ExtentReports and attach the HtmlReporter
    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
    }

    
    @Test
    public void testCaseOne() {
    	logger = extent.createTest("Test Case 1", "PASSED test case1");
      	logger.log(Status.INFO,"testcase 1");
    	logger.log(Status.PASS, "testcase1 failed");
    	    	  	
    }

    @Test
    public void testCaseTwo() throws IOException {
    	logger = extent.createTest("Test Case 2", "PASSED test case1");
      	logger.log(Status.INFO,"testcase 2");
    	logger.log(Status.FAIL, "testcase2 failed");
    	logger.fail("Testcase failed ", MediaEntityBuilder.createScreenCaptureFromPath("./reources/SampleJPGImage_1mbmb.jpg").build());    	  	
    }
    
    
    @AfterTest
    public void tearDown() {
    	//to write or update test information to reporter
        extent.flush();
    }

}
