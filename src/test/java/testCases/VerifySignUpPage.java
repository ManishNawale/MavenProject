package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPageObject;
import resources.BaseClass;

public class VerifySignUpPage extends BaseClass {

	@Test
	public void SignUpPage() throws IOException, InterruptedException {
		driverInitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		SignUpPageObject obj=new SignUpPageObject(driver);
		
		obj.EnterFirstName().sendKeys("Manish");
		Thread.sleep(1000);
		
		obj.EnterLastName().sendKeys("Nawale");
		Thread.sleep(1000);
		
		obj.EnterEmail().sendKeys("manishnawale.msn@gmail.com");
		Thread.sleep(1000);
		
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterJobTitle().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		obj.EnterCompany().sendKeys("SSQUAREIT Solution pvt Ltd.");
		Thread.sleep(1000);
		
		obj.EnterEmployees().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		obj.EnterEmployees().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		obj.EnterPhone().sendKeys("1234567890");
		Thread.sleep(1000);
		
		obj.EnterCountry().sendKeys("India");
		Thread.sleep(1000);
		
		obj.EnterState().sendKeys("Maharashtra");
		Thread.sleep(1000);
		
		obj.ClickOnIagree().click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
}
