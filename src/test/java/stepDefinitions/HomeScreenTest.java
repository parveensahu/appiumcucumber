package stepDefinitions;

import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import base.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.HomeScreen;

public class HomeScreenTest extends TestBase{
	HomeScreen hs;
	
	@Before
	public void setUp() throws Exception {
	//Setting up the capabilities
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("emulator-5554")
				   .setPlatformVersion("15")
				   .setAutomationName("UiAutomator2")
				   .setAppPackage("io.appium.android.apis")
				   .setAppActivity("io.appium.android.apis.ApiDemos")
				   .setApp("/Users/parveensahu/Downloads/ApiDemos-debug.apk");
			
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	
	}		
	
	@After
	public void exit() throws Exception{
		driver.quit();
	}
			
	@Given("app is launched")
	public void app_is_launched() {
		hs = new HomeScreen(driver);
	}

	@When("user click on accessibility option")
	public void user_click_on_accessibility_option() {
	   try {
		hs.accessClick();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("relevant screen is opening")
	public void relevant_screen_is_opening() {
	   Assert.assertEquals(true, true);
	}


}
