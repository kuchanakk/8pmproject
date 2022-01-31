package pack1;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;
import java.net.*;


public class CloudTest {
	
	//public static  String USERNAME = "kirankumar69";
	//public static  String AUTOMATE_KEY = "7tuyBZ4XqsNkYkqzkbzm";
	//public static  String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static WebDriver driver;
	@Test
	
	public static void test1() throws MalformedURLException, InterruptedException {
		
		
		MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("username", System.getenv("oauth-testingtoolsonline-2c800"));
        sauceOptions.setCapability("access_key", System.getenv("77018121-b616-46a5-b877-4d1be84f62c3"));
        sauceOptions.setCapability("browserVersion", "latest");
        sauceOptions.setCapability("platformName" , "windows");
        
		

        ChromeOptions options = new ChromeOptions();
        
        options.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-testingtoolsonline-2c800:77018121-b616-46a5-b877-4d1be84f62c3@ondemand.eu-central-1.saucelabs.com:443/wd/hub");

        driver = new RemoteWebDriver(url, options);
        
        driver.get("http://www.facebook.com");
        Thread.sleep(10000);
        System.out.println(driver.getTitle());
        driver.close();
	}
	
	
	
	
	

}
