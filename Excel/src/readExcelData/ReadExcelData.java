package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\Babek Chalabi\\Desktop\\Excel\\src\\readExcelData\\Traceability Matrix of Travel Portal.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 =  wb.getSheetAt(0);
		String data0 = Sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is:" + data0);
		
		
			
	}

}
