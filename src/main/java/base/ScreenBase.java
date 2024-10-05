package base;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class ScreenBase {
	
	public static AppiumDriver driver;
	public WebDriverWait wait;
	
	public ScreenBase(AppiumDriver driver) {
		this.driver = driver;
	}
	

}
