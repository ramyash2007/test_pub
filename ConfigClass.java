package config_utility_base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ConfigClass {
	
	public static AndroidDriver<AndroidElement> driver;
	
	public static String appiumURL = "http://0.0.0.0:4723/wd/hub";
	
	public static String projectPath = System.getProperty("user.dir");
	
	public static String appPath = projectPath + "\\apps\\calculator.apk";
	
	// public static String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	
	
	
	
			
}
