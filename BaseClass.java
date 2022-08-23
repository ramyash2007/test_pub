package config_utility_base;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;


public class BaseClass extends UtilityClass {
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		launchApp();
		
		
	}


  @AfterMethod
	public void tearDown() {
	  closeApp();
	}

}
