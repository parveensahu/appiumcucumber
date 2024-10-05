package runner;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.AppiumServer;


@CucumberOptions(
		features = "src/test/java/features/homescreen.feature",
		glue = { "stepDefinitions" },
		plugin = { "pretty"},
		monochrome = true, 
		publish = true,
		dryRun = false
		)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {
	public static AppiumDriver driver;
	
	 @BeforeSuite 
	 public void setUp() throws IOException 
	 { AppiumServer.start(); }
	  
	 @AfterSuite public void tearDown() 
	 { AppiumServer.stop(); 
	 }
	 
	 
}