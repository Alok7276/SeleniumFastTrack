package com.qa.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	static Workbook wb;
	static Sheet sheet;
	static Row r;
	static Cell cell;
public static void main(String[] args) throws Exception {
	FileInputStream ip=new FileInputStream("C:\\Users\\Alok\\Desktop\\test data.xlsx");
	wb=WorkbookFactory.create(ip);
	sheet=wb.getSheet("login");
	for(int i=0;i<sheet.getLastRowNum();i++) {
		for (int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
			String v = sheet.getRow(i+1).getCell(j).toString();
			System.out.println(v);
		}
	}
}
}
