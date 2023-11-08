package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleExcel {

	@Test
	public void handleexcel() throws IOException, InterruptedException {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\Desktop\\For Xcel TestNG Practice.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		
		XSSFCell A=row.getCell(0);
		XSSFCell B=row.getCell(1);
		
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Username.click();
		Thread.sleep(1000);
		Username.sendKeys(A.getStringCellValue());
		Thread.sleep(1000);
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Thread.sleep(1000);
		Password.sendKeys(B.getStringCellValue());
		Thread.sleep(1000);
		
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Login.click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}
	
}
