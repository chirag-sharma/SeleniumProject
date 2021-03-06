package dataprovider;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() {
		File src = new File("./TestData/AppData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	public String getData(String sheetName,int row, int column) {
		XSSFSheet sheet = wb.getSheet(sheetName);
		String str = sheet.getRow(row).getCell(column).getStringCellValue();
		return str;
	}
	public String getData(int sheetNo,int row, int column) {
		//XSSFSheet sheet = wb.getSheetAt(sheetNo);
		//SFSheet sheet = wb.getSheetAt();
		XSSFSheet sheet = wb.getSheetAt(sheetNo);
		wb.getNumberOfSheets();
		
		XSSFRow ro = sheet.getRow(row);
		XSSFCell cell = ro.getCell(column);
		String str = sheet.getRow(row).getCell(column).getStringCellValue();
		return str;
	}
	public String getData(String sheetName,String methodName,String value) {
		XSSFSheet sheet = wb.getSheet(sheetName);
		//String str = sheet.getRow(row).getCell(column).getStringCellValue();
		int lastRow = sheet.getLastRowNum();
		int lastCol = sheet.getRow(0).getLastCellNum();
		int row=0;
		int col=0;
		for(int i=0;i<lastRow;i++) {
			if(sheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase(methodName)) {
				row=i;
			//for(int j=0;j<lastCol;j++) {
				
			}
		}
	
		for(int j=0;j<lastCol;j++) {
			if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase(value)) {
				col=j;	
			}
		}
		
		String str = sheet.getRow(row).getCell(col).getStringCellValue();
		return str;
	}
	

	
	//abhi isme list ka concept dalna hai ki key row 0 se pick kare and value jo bhi row no hoga usse
	
}
