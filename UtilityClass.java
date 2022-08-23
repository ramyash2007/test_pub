package config_utility_base;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UtilityClass extends ConfigClass{
	
	

	public static  AndroidDriver<AndroidElement> launchApp() throws IOException, InterruptedException
	{
		
		
	     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("platformVersion", "");
		capabilities.setCapability("deviceName", "");
		capabilities.setCapability("app", appPath);
		capabilities.setCapability("noReset", true);
		

		driver = new AndroidDriver<AndroidElement>(new URL(appiumURL), capabilities);
	    
	    return driver;
	}
	

	
	public void closeApp() {
		driver.closeApp();
	}
	
}
