package com.maven.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelUsrnme extends FunctionalLibrary {
	public static void main(String[] args) throws IOException {
		File fi = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Excel\\Book2.xls");
		FileInputStream fis = new FileInputStream(fi);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		Row row1 = sh.getRow(1);
		Cell cell1 = row1.getCell(0);
		String cellstr1 = cell1.getStringCellValue();
		browserLaunch();
		openApp("http://automationpractice.com/index.php");
		
		A_Login al = new A_Login();
		clickBtn(al.getLogin());
		enterText(al.getEmailaddress(), cellstr1);
//		WebElement findElement = driver.findElement(By.id("email"));
//		findElement.sendKeys(cell1);
		Row row2 = sh.getRow(1);
		Cell cell2 = row2.getCell(1);
	
		CellType cellType = cell2.getCellType();
		String value = null ;
			
		if (cellType.equals(CellType.NUMERIC)) {
		double d = cell2.getNumericCellValue();
		long l=(long)d;
		value = String.valueOf(l);
		
		enterText(al.getPassword(), value);

			
			
		}else if (cellType.equals(CellType.STRING)) {
				
		value = cell2.getStringCellValue();
			}
				
		clickBtn(al.getSignin());
		
		
		
		
		
		
	}}
