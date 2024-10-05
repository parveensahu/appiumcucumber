package utility;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

	static AppiumDriverLocalService server;

	public static void start() {
		AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder
                .withAppiumJS(new File("/opt/homebrew/Cellar/appium/2.11.3/libexec/lib/node_modules/appium/build/lib/main.js"))
                .usingDriverExecutable(new File("/opt/homebrew/bin/node"))
                .usingPort(4723)
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                .withLogFile(new File("Appiumlog.txt"))
                .withIPAddress("127.0.0.1");
        server = AppiumDriverLocalService.buildService(builder); 
        server.start();
	}

	public static void stop() {
		server.stop();
	}
}
