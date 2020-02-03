package com.maven.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelRead1 {

	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Excel\\Book1.xls");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);		
		int noofrows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < noofrows; i++) {
		Row row = s.getRow(i);	
		int noofcells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < noofcells; j++) {
			Cell cell = row.getCell(j);
			
		CellType cellType = cell.getCellType();
		String value = null ;
			
		if (cellType.equals(CellType.NUMERIC)) {
		double d = cell.getNumericCellValue();
		long l=(long)d;
		value = String.valueOf(l);
			
			
		}else if (cellType.equals(CellType.STRING)) {
				
		value = cell.getStringCellValue();
			}

			
			System.out.println(value);
		}
		
		
		
		
		
		
		
		}
	}
	
	
}
