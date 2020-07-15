package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	public static String[][] readExcelData(String dataSheetName) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook("./data/TestData.xlsx");
		XSSFSheet sheet = workbook.getSheet(dataSheetName);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String data[][] = new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++) {
				
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				
				data[i-1][j] = value;
			}
			
		}
		
		workbook.close();
		
		return data;
	}
	
	public static void writeExcel(String sheetName, String leadID) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.createRow(1);
		XSSFCell cell = row.createCell(0);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(leadID);
		
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		workbook.write(fos);
		
		fos.close();
		workbook.close();

	}
	
public static void writeExcel(String sheetName, String leadID, String duplicateLeadID) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.createRow(1);
		XSSFCell cell = row.createCell(0);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(leadID);
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellType(CellType.STRING);
		cell1.setCellValue(duplicateLeadID);
		
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		workbook.write(fos);
		
		fos.close();
		workbook.close();

	}
	

}
