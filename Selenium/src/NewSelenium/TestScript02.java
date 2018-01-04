package NewSelenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestScript02{
	
	public static void main(String [] args) throws Exception
	{
		File src= new File ("C:\\Users\\admin\\Desktop\\TestScript.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount =  sheet1.getLastRowNum();
		
		System.out.println("Toatal Rows is= "+rowcount);
		
		for(int i=0;i<rowcount; i++ )
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("Test Data of Excel is= "+data0);
			System.out.println("Test Data of Excel is= "+data1);
			
		}



//		if(i==0)
//		{
//		positivemethod();
//		}
			
	}
 
}

