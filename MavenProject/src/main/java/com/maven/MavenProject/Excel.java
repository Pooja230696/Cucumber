package com.maven.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {

	public static String getdata(int rownum, int cellnum) throws Throwable {

		File fi = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Excel\\Book1.xls");
		FileInputStream fis = new FileInputStream(fi);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		Row row2 = sh.getRow(rownum);
		Cell cell = row2.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String value = null;

		if (cellType.equals(CellType.NUMERIC)) {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);

		} else if (cellType.equals(CellType.STRING)) {

			value = cell.getStringCellValue();
		}

		return value;
	}

	public static void updatedata(int rownum, int cellnum, String value) throws Throwable {

		File fi = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Excel\\Book1.xls");
		FileInputStream fis = new FileInputStream(fi);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		Row row = sh.getRow(rownum);
		if (row == null) {
			row = sh.createRow(rownum);
		}
		Cell cell = row.getCell(cellnum);
		if (cell == null) {
			cell = row.createCell(cellnum);
		}
		cell.setCellValue(value);

		FileOutputStream fout = new FileOutputStream(fi);
		wb.write(fout);
		wb.close();
		System.out.println("Updated");
	}

	public static void main(String[] args) throws Throwable {
		updatedata(8, 5, "Test");
	}

}
