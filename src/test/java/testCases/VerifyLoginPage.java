package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import resources.BaseClass;

public class VerifyLoginPage extends BaseClass {

	@Test
	public void  verifylogin() throws IOException, InterruptedException {
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		LoginPageObject obj=new LoginPageObject(driver);
		
		FileInputStream FS=new FileInputStream("C:\\Users\\HP\\Desktop\\For Xcel TestNG Practice.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(FS);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		
		XSSFCell a=row.getCell(0);
		XSSFCell b=row.getCell(1);
		
		obj.EnterUsername().sendKeys("manishnawale.msn@gmail.com");
		Thread.sleep(1000);
		obj.EnterPassword().sendKeys("xyz#123");
		Thread.sleep(1000);
		/*obj.ClickOnLogin().click();
		Thread.sleep(1000);*/
		obj.ClickOnTryForFree().click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
}
