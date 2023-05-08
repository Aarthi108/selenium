package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void writeExcelsheet() throws IOException
	{
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("sheet 1");
		
		int rowNum=0;
		for(int i=1;i<=10;i++)
		{
			Row row = sheet.createRow(rowNum++);
			
			int cellNum =0;
			for(int j=1;j<=10;j++)
			{
				Cell cell = row.createCell(cellNum++);
				cell.setCellValue("Row"+i+"Cell"+j);
			}
		}
		String path = System.getProperty("user.dir")+"/src/test/resources/TestdataExcelfile/Demo.xls";
		File excelFile = new File(path);
		FileOutputStream Fos = null;
		try {
			 Fos = new FileOutputStream(excelFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			Fos.close();
		}
		
	}
	public static void main(String[] args) throws IOException {
		 writeExcelsheet();
		
		
	}
}
