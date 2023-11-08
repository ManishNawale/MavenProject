package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FullScreenShot {

	@Test
	public void CapturingScreenShot() throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nasa.gov/humans-in-space/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		TakesScreenshot ScreenShot=(TakesScreenshot)driver;
		
		File source=ScreenShot.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\HP\\Pictures\\Screenshots\\.png");
		
		FileUtils.copyFile(source, Destination);
		
		driver.quit();
		
	}
	
}
