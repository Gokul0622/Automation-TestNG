import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/Data.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");

		int RowCount = ws.getLastRowNum();
		System.out.println(" No Of Rows: " + RowCount);

		int CellCount = ws.getRow(0).getLastCellNum();
		System.out.println(" Cell Count Value is : " + CellCount);

		for (int i = 1; i <= RowCount; i++) {
			for (int j = 0; j < CellCount; j++) {
				String ExcelData = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println();
				System.out.println(ExcelData);
			}
		}
		wb.close();

	}
}
