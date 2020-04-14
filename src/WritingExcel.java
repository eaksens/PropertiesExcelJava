import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WritingExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();

		// create sheet on the work book, the HSSFSheet have private constructor
		XSSFSheet sheet0 = workbook.createSheet("firstsheet");
		// XSSFSheet sheet2 = wb.createSheet("second sheet");

		/*
		 * //create row in sheet1 Row row0 = sheet0.createRow(0);
		 * 
		 * //create the cell -columns 
		 * Cell cellA = row0.createCell(0); 
		 * Cell cellB = row0.createCell(1);
		 * 
		 * cellA.setCellValue("First cell"); 
		 * cellB.setCellValue("Second cell");
		 */

		for (int rows = 0; rows < 10; rows++) {
			//create rows
			Row row = sheet0.createRow(rows);
			
			for (int cols = 0; cols < 10; cols++) {
				//create columns
				Cell cell = row.createCell(cols);
				cell.setCellValue((int) (Math.random() * 100));

			}
		}

		// connection streams
		// creating file stream
		File fileStoredLocation = new File("C:\\Users\\mai_s\\eclipse-workspace\\filewriter\\myExcelfile1.xlsx");
		//writing -FileOutputStream
		FileOutputStream fo = new FileOutputStream(fileStoredLocation); 

		// writing workbook to outputstream
		workbook.write(fo);

		// closing stream
		fo.close();
		
		workbook.close();

		System.out.println("File is created !!!");

	}

}
