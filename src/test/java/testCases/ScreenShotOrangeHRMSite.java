package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotOrangeHRMSite {

	@Test
	public void OrangeHRM() throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File ScreenShot=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div")).getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\HP\\Pictures\\.png");
		FileUtils.copyFile(ScreenShot, Destination);
		
		driver.close();
		
	}
	
}
