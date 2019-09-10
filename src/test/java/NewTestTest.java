import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class NewTestTest {
	private IOSDriver driver;

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
//		(new TouchAction(driver)).tap(256, 596).perform();
//		(new TouchAction(driver)).tap(126, 338).perform();
//		(new TouchAction(driver)).tap(117, 342).perform();
//		(new TouchAction(driver)).tap(270, 335).perform();
//		(new TouchAction(driver)).tap(104, 398).perform();
//		(new TouchAction(driver)).tap(128, 439).perform();
//		(new TouchAction(driver)).tap(115, 529).perform();
//		(new TouchAction(driver)).tap(63, 74).perform();
		

		
	
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("platformVersion", "12.4");
		desiredCapabilities.setCapability("deviceName", "iPhone Xs Max");
		desiredCapabilities.setCapability("newCommandTimeout", "300");
		desiredCapabilities.setCapability("bundleId", "cn.gov.customs.zshg");
		desiredCapabilities.setCapability("onReset", true);
		

		try {
			URL remoteUrl = new URL("http://localhost:4723/wd/hub");
			driver = new IOSDriver(remoteUrl, desiredCapabilities);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public void afterClass() {
		if (driver != null) {
			driver.quit();
		}

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

	@Test
	public void afterClassTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void afterMethodTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void afterSuiteTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void afterTestTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void beforeClassTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void beforeMethodTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void beforeSuiteTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void beforeTestTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void dpTest() {
//		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void fTest() {
//		throw new RuntimeException("Test not implemented");
		(new TouchAction(driver)).press(367, 700).waitAction(2000).moveTo(31 , 700).release().perform().waitAction(6000);
		IOSElement ie1Element = (IOSElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"掌上海关\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]");
		(new TouchAction(driver)).tap(ie1Element).perform().waitAction(3000);
	}
}
