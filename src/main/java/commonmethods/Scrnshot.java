package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pack1.Testbase;

public class Scrnshot extends Testbase {
	
	
	
	public static void screenshot() throws IOException {
		
		File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotfile, new File("D:\\error8pm.png"));
		
		
	}

}
