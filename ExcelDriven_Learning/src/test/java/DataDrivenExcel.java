import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public  ArrayList<String> getData(String testcaseName) throws IOException {
		
		ArrayList<String> al = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("c://demodata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheet_Count = workbook.getNumberOfSheets();
		//System.out.println(sheet_Count);

		for (int i = 0; i < sheet_Count; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
	
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator();

				int k = 0;
				int column = 0;
				while (cells.hasNext()) {

					Cell value = cells.next();// here we are grabbing entire cell
					
					if (value.getStringCellValue().equalsIgnoreCase("testcases")) {
						//System.out.println(value.getStringCellValue());
						column = k;
						break;
					}
					k++;
				}
				while (rows.hasNext()) {
					Row row_value = rows.next();
					//System.out.println(row_value);
					if (row_value.getCell(0).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						
						Iterator<Cell> row_Cell = row_value.cellIterator();
						while (row_Cell.hasNext()) {
							Cell rc = row_Cell.next();
							//System.out.println(rc.getCellType());
							if(rc.getCellType()==CellType.STRING) {
								al.add(rc.getStringCellValue());
							}
							else {
								al.add(NumberToTextConverter.toText(rc.getNumericCellValue()));
							}
							
						}
					}
				}

			}
		}
		return al;
	}
	
	public static void main(String[] args) throws IOException {
		
}

}
