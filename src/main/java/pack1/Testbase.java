package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.fasterxml.jackson.databind.node.IntNode;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static void openBrowser(String browser) {
		
		//String browser ="chrome";
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 
			driver.get("http://advantageonlineshopping.com/");
			
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			//driver.manage().window().maximize();
			
			 driver = new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://advantageonlineshopping.com/");
		}else if(browser.equals("ie")) {
			
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			driver.get("http://advantageonlineshopping.com/");
			
		}
		
		
		
		
	}
	
	
	
	public static void closebrowser() {
		
		driver.close();
	}
	
	

}
