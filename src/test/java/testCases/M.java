package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class M {

	@Test
	public void LaunchTheURl() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=HdDvuSfq7Ik");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.close();
		
	}
	
}
