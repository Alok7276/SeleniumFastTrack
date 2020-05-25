package com.qa.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	static Workbook wb;
	static Sheet sheet;
	static Row r;
	static Cell cell;

	public static void main(String[] args) throws Exception {
		FileInputStream ip = new FileInputStream("C:\\Users\\Alok\\Desktop\\test data.xlsx");
		wb=WorkbookFactory.create(ip);
		sheet=wb.getSheet("login");
		r=sheet.getRow(0);
		cell=r.getCell(1);
		String v = cell.getStringCellValue();
		System.out.println(v);
	
	}
}
