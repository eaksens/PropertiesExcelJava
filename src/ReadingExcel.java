import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File fileStoredLocation = new File("C:\\Users\\mai_s\\eclipse-workspace\\filewriter\\myExcelfile.xlsx");
		
		//read the file
		FileInputStream fi = new FileInputStream(fileStoredLocation);
		
		Workbook workbook = WorkbookFactory.create(fi);
		
		Sheet sheet0 = workbook.getSheetAt(0);
		
		/*Row row0 =  sheet0.getRow(0);
		Cell cellA = row0.getCell(0);*/
		
		//read data on row 0 and column 0
		//System.out.println(cellA);
		
		for(Row row:sheet0) {
			for(Cell cell: row) {
				switch(cell.getCellType()) 
				{
				case cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue()+"\t");
					break; //break out of the for loop
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.println("Blank cell"+"\t");
					break;
					
				}
			}
		}
		
		fi.close();
		
	}

}
