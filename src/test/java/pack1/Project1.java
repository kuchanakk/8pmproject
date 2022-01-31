package pack1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Exceldata;
import commonmethods.Extentrep;
import commonmethods.Scrnshot;
import objrep.HomePage;

public class Project1 extends Testbase{
	static Extentrep extr;
	
	@BeforeTest
	public static void setup() {
		 extr=new Extentrep();
		extr.extentsetup();
		
	}
	
	@AfterTest
	public static void rep() {
		extr.repgen();
	}
	
	@BeforeMethod
	public static void openbrowser() {
		
		//Testbase tb = new Testbase();
		//tb.openBrowser("firefox");
		Project1.openBrowser("firefox");
		
	}
	
	@Test
	public static void tablettest() throws InterruptedException, IOException {
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(15000);
		hp.popitem().click();
		hp.tablet().click();
		Thread.sleep(5000);
		String actualtabtext=hp.producttext().getText();
		Exceldata excel= new Exceldata();
		String exxpectedtabletext=excel.readdata(3, 0);
		
		if(actualtabtext.contains(exxpectedtabletext)) {
			System.out.println("tablet text is passed");
			excel.writedata(3, 1, "valid data");
			//Assert.assertTrue(true);
			extr.pass();
			
		}else {
			
			System.out.println("tablet text is not passed");
			excel.writedata(3, 1, "invalid data");
			Scrnshot sc = new Scrnshot();
			sc.screenshot();
			//Assert.assertTrue(false);

			extr.fail();
		}
		
	}
	
	
	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		Thread.sleep(15000);
		hp.popitem().click();
		hp.laptop().click();
		Thread.sleep(5000);
		String actuallaptext=hp.producttext().getText();
		Exceldata excel= new Exceldata();
		String exxpectedalptext=excel.readdata(1, 0);
		
		if(actuallaptext.contains(exxpectedalptext)) {
			System.out.println("laptop text is passed");
			excel.writedata(1, 1, "valid data");
			//Assert.assertTrue(true);
			extr.pass();
			
		}else {
			
			System.out.println("laptop text is not passed");
			excel.writedata(1, 1, "invalid data");
			Scrnshot sc = new Scrnshot();
			sc.screenshot();
			
			//Assert.assertTrue(false);
			extr.fail();
		}
		
	}
	
	@Test
	public static void spktest() throws InterruptedException, IOException {
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(15000);
		hp.popitem().click();
		hp.spk().click();
		Thread.sleep(5000);
		String actualspktext=hp.producttext().getText();
		Exceldata excel= new Exceldata();
		String exxpectedspktext=excel.readdata(2, 0);
		
		if(actualspktext.contains(exxpectedspktext)) {
			System.out.println("spk text is passed");
			excel.writedata(2, 1, "valid data");
			//Assert.assertTrue(true);
			extr.pass();
			
		}else {
			
			System.out.println("spk text is not passed");
			excel.writedata(2, 1, "invalid data");
			Scrnshot sc = new Scrnshot();
			sc.screenshot();
			//Assert.assertTrue(false);
extr.fail();
		}
		
	}
	
	
	@AfterMethod
	public static void closeb() {
		driver.close();
		
	}
	

}
