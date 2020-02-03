package com.maven.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel_Url extends FunctionalLibrary {
	

	public static void main(String[] args) throws IOException {
		File fi = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Excel\\Book3URL.xls");
		FileInputStream fis = new FileInputStream(fi);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		int numofrows = sh.getPhysicalNumberOfRows();
		for(int i=0;i<numofrows;i++)
		{
			Row row = sh.getRow(i);	
//			int noofcells = row.getPhysicalNumberOfCells();
//			for (int j = 0; j < noofcells; j++) 
				Cell cell = row.getCell(0);
				
			
			String value = null ;
			value = cell.getStringCellValue();
			
		browserLaunch();
			openApp(value);
			String title = driver.getTitle();
			if(cell==null) {
				Row crrow = sh.createRow(i);
				Cell crcell = crrow.getCell(1);
				crcell.setCellValue(title);
			} 
		
				
		
			FileOutputStream fio = new FileOutputStream(fi);
			wb.write(fio);
			wb.close();
		}
		
			driver.close();
	}
}


			
	
		
	
		
	



