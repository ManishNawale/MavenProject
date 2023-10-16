package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class HandlingExcelSheet {

	@Test
	public void excelHandling() throws IOException {
		FileInputStream FS=new FileInputStream("C:\\Users\\HP\\Desktop\\For Xcel TestNG Practice.xlsx");
		
		XSSFWorkbook Workbook=new XSSFWorkbook(FS);
		XSSFSheet Sheet=Workbook.getSheetAt(0);
		XSSFRow Row=Sheet.getRow(0);
		XSSFCell cell=Row.getCell(0);
		
		System.out.println(Sheet.getRow(0).getCell(0));
		System.out.println(Sheet.getRow(0).getCell(1));
		
	}
	
}
