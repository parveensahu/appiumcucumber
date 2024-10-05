package screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen extends ScreenBase{

	public HomeScreen(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='App']")
	public WebElement name;
	
	public void accessClick() throws Exception {
		try {
			name.click();
		} catch (Exception e) {
			System.out.println("User is unable to click");
			throw e;
		}
	}

}
