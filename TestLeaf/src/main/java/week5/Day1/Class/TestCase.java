package week5.Day1.Class;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestCase {

	private static XSSFSheet xssfSheet;

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./TestLeaf\\Data.xlsx");
		XSSFSheet xs = wb.getSheet("Sheet1");
		
 
	}

}
