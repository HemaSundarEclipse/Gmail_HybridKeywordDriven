package com.gmail.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {

	static HSSFWorkbook wb;
	static HSSFSheet ws;
	
	public static void setExcelFile() throws IOException {
		FileInputStream fs = new FileInputStream("D:\\workspace\\Gmail_HybridKeywordDriven\\src\\test\\java\\com\\gmail\\dataEngine\\TestData.xls");
		wb = new HSSFWorkbook(fs);
	}
	
	public static String getCellData(int RowCount, int ColumnCount, String SheetName) {
		ws = wb.getSheet(SheetName);
		return ws.getRow(RowCount).getCell(ColumnCount).getStringCellValue();
		
	}

	public static void setCellData(int RowCount, int ColumnCount, String SheetName) throws IOException {
		FileOutputStream fo = new FileOutputStream("D:\\workspace\\Gmail_HybridKeywordDriven\\src\\test\\java\\com\\gmail\\dataEngine\\TestData.xls");
		ws = wb.getSheet(SheetName);
		ws.getRow(RowCount).getCell(ColumnCount).setCellValue("YES");
		wb.write(fo);
		fo.close();
		
		FileInputStream fs = new FileInputStream("D:\\workspace\\Gmail_HybridKeywordDriven\\src\\test\\java\\com\\gmail\\dataEngine\\TestData.xls");
		wb = new HSSFWorkbook(fs);
	}
	public static int getRowCount(String SheetName) {
		ws = wb.getSheet(SheetName);
		return ws.getLastRowNum()+1;
		
	}
	
	
}
