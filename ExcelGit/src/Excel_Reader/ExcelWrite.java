package Excel_Reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		String path=System.getProperty("user.dir")+"\\src\\XLS_Files\\TestData.xlsx";
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		sheet.getRow(0).createCell(3).setCellValue("manpreet");
		FileOutputStream fileOut = new FileOutputStream(path);
		workbook.write(fileOut);
	    fileOut.close();	
	}
}