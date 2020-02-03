package com.maven.Flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maven.MavenProject.FunctionalLibrary;

public class Flipkart_01 extends FunctionalLibrary {
	public void update(int Sh,int rownum,int cellnum) throws IOException {
				
		
			
			
		}

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		browserLaunch();
		openApp("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 List<WebElement> acList = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		 List<WebElement> ele = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_Electronics')]"));
		 int size = ele.size();
		 List<WebElement> tv = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_TVs%20%26%20Appliances')]"));
		 List<WebElement> Men = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_Men')]"));
		 List<WebElement> Women = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_Women')]"));
		 List<WebElement> Baby = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_Baby%20%26%20Kids')]"));
		 List<WebElement> Home = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_Home%20%26%20Furniture')]"));
		 List<WebElement> Sport = driver.findElements(By.xpath("//a[contains(@href,'otracker=nmenu_sub_Sports%2C%20Books%20%26%20More')]"));
		 
		 
		 
		 

		 File fi = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Excel\\Flipkart_menu.xls");
			FileInputStream  fis = new FileInputStream(fi);
			Workbook wb = new HSSFWorkbook();
		 for(WebElement e : acList) {
			mouseHover(e);
		 String text2 = e.getText();
		 for (int i =0;i <size;i++ ) {
			
		
		 Sheet sheetAt = wb.getSheet(text2);
		 if (sheetAt==null) {
			sheetAt = wb.createSheet(text2);
		}
		 Row row = sheetAt.getRow(i);
		 if (row==null) {
			row = sheetAt.createRow(i);
		}
		 Cell cell = row.getCell(0);
		 if (cell==null) {
			cell = row.createCell(0);
		}
		 String text = ele.get(i).getText();
		 cell.setCellValue(text);
		 }}
//			String text = e.getText();
//			System.out.println(text);
//			Sheet sh = wb.createSheet(text);
//			int rownum = 0;
//			Row row = sh.createRow(rownum);
//			int column=0;
//			Cell cell = row.createCell(column);
		 
			
		
			
			FileOutputStream fout = new FileOutputStream(fi);
			wb.write(fout);
			wb.close();
		
			
			 
					 }
		 

		
	
	

}
