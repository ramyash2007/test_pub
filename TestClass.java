package config_utility_base;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidElement;

public class TestClass extends BaseClass {
	

	@Test
	public void test01() throws InterruptedException {

		AndroidElement num1 = driver.findElement(By.id("button1"));
		num1.click();
		
		AndroidElement add = driver.findElement(By.id("buttonAdd"));
		add.click();
		
		AndroidElement num2 = driver.findElement(By.id("button2"));
		num2.click();
		
		AndroidElement equal = driver.findElement(By.id("buttonEquals"));
		equal.click();
		
		Thread.sleep(1000);
		
		String expectedValue = "3";
		String actualValue = driver.findElement(By.id("display")).getText();
		Assert.assertEquals(expectedValue, actualValue);
		System.out.println(actualValue);
		
		Thread.sleep(2000);

	}

	@Test
	public void test02() throws InterruptedException {

		AndroidElement num1 = driver.findElement(By.id("button3"));
		num1.click();
		
		AndroidElement add = driver.findElement(By.id("buttonAdd"));
		add.click();
		
		AndroidElement num2 = driver.findElement(By.id("button4"));
		num2.click();
		
		AndroidElement equal = driver.findElement(By.id("buttonEquals"));
		equal.click();
		
		Thread.sleep(1000);
		
		String expectedValue = "7";
		String actualValue = driver.findElement(By.id("display")).getText();
		Assert.assertEquals(expectedValue, actualValue);
		System.out.println(actualValue);

		Thread.sleep(2000);
	}
	
	


}
