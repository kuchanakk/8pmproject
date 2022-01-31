package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static WebDriver driver;
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public static WebElement popitem() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
		
	}
	
	public static WebElement tablet() {
		
		return driver.findElement(By.id("details_16"));
	}
	
	public static WebElement laptop() {
		
		return driver.findElement(By.id("details_10"));
	}
 
	public static WebElement spk() {
		
		return driver.findElement(By.id("details_21"));
	}
	
	public static WebElement producttext() {
		return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	}
	
	

}
