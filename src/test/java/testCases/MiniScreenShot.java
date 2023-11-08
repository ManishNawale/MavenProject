package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MiniScreenShot {

	@Test
	public void PerticularPartScreenShot() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nasa.gov/nasa-missions/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File ScreenShot=driver.findElement(By.xpath("//*[@id=\"Missions\"]/div[2]/div")).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\HP\\Pictures\\Screenshots\\.png");
		
		FileUtils.copyFile(ScreenShot, Destination);
		
		driver.quit();
		
	}
	
}
