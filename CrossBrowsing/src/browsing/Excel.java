package browsing;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream(new File("C:\\Users\\admin\\Desktop\\Java+Selenium\\TestCase1.xlsx"));

		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheetAt(0);

		 FormulaEvaluator formulaEve = wb.getCreationHelper().createFormulaEvaluator();

		for (Row row : sheet) {
			for (Cell cell : row) {
				switch (formulaEve.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue() + "\t\t");
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue() + "\t\t");
					break;
				}
			}
			System.out.println();
		}
	}

}
