import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.TouchAction;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

  private IOSDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "12.4");
    desiredCapabilities.setCapability("deviceName", "iPhone Xs Max");
    desiredCapabilities.setCapability("newCommandTimeout", "300");
    desiredCapabilities.setCapability("bundleId", "cn.gov.customs.zshg");
    desiredCapabilities.setCapability("onReset", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new IOSDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    (new TouchAction(driver)).tap(256, 596).perform();
    (new TouchAction(driver)).tap(126, 338).perform();
    (new TouchAction(driver)).tap(117, 342).perform();
    (new TouchAction(driver)).tap(270, 335).perform();
    (new TouchAction(driver)).tap(104, 398).perform();
    (new TouchAction(driver)).tap(128, 439).perform();
    (new TouchAction(driver)).tap(115, 529).perform();
    (new TouchAction(driver)).tap(63, 74).perform();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
