package unittest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import factory.DataProviderFactory;

public class Windowshandle {
	WebDriver driver;
	WebDriver drivers;
	@Test
	public void check() {
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().getConfigProperty("ChromeDriver"));
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().getConfigProperty("IEDriver"));
		drivers = new InternetExplorerDriver();
		drivers.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id='search']")).sendKeys("Ja Ni tera khakh na rahe");
		
		
		String itr = driver.getWindowHandle();
		System.out.println(itr);
		
		Set<String> itrs = driver.getWindowHandles();
		System.out.println(itrs.size());
		System.out.println(itrs);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
}
	

	

