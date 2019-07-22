package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class CaptureScreenshot {
	
	public static String func_captureScreenshot(WebDriver driver, String StepNo) {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File opfile = scrShot.getScreenshotAs(OutputType.FILE);
		String dest = "C:\\Users\\chira\\eclipse-workspace\\com.generic\\screenshots\\"+StepNo+".png";
		File destfile = new File(dest);
		
		try {
			FileUtils.copyFile(opfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return dest;
		
		
	}

}
