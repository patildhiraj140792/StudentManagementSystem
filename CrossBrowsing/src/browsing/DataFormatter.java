package browsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFormatter {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		File source = new File("C:\\Users\\admin\\Desktop\\Java+Selenium\\TestCase1.xlsx");

		FileInputStream fis = new FileInputStream(source);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		FormulaEvaluator formula = wb.getCreationHelper().createFormulaEvaluator();

		for (Row row : sheet1) {
			for (Cell cell : row) {
				switch (formula.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue() + "\t\t\t");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue() + "\t\t\t");
					break;
				}
			}
			System.out.println();
		}
	}
}
