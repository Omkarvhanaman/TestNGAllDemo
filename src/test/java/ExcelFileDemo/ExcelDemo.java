package ExcelFileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.python.antlr.ast.Call;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExcelDemo {
 
	public static Object[][] getExcelData( String fileName,String sheetname) throws IOException{
		 
		Object[][] data =null;
		Workbook web1 =null;
		//File file=new File (filePath);
		FileInputStream file1= new FileInputStream(fileName);
		String fileExtensionName=fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx")) {
			web1=new XSSFWorkbook(file1);
		}
		else if(fileExtensionName.equals(".xls")){
			web1=new HSSFWorkbook(file1);
		}
		Sheet sheet=web1.getSheet(sheetname); 
		Row row =sheet.getRow(2);
		int noofRow=sheet.getPhysicalNumberOfRows();
		int noOfcols= row.getLastCellNum();
		Cell cell;
		data = new Object[noofRow-1][noOfcols];
		 for(int i =1;i<noofRow;i++) {
			 for(int j=0;j<noOfcols;j++) {
				 row=sheet.getRow(i);
				 cell=row.getCell(j);
				 switch (cell.getCellType( )) {	
				 case STRING :
				 			data [i-1][j]=cell.getStringCellValue();
				 			break;
				 			
				 case NUMERIC:
					 data [i-1][j]=(int)cell.getNumericCellValue();
				 			break;		
				 		}		
				 	}	
			 }
		 
		return data;
	}
		
	 
	}
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

