package ExcelFileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ExcelFileDemo {

	public static void readExcal(String filePath,String  fileName, String  sheetName ) throws IOException {
		File file=new File (filePath);
		FileInputStream file1= new FileInputStream(file);
		Workbook web1 =null;
		String fileExtensionName=fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx")) {
			web1=new XSSFWorkbook(file1);
		}
		else if(fileExtensionName.equals(".xls")){
			web1=new HSSFWorkbook(file1);
		}
		Sheet sheet=web1.getSheet(sheetName);
		int rowCoun=sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("total no row:- "+rowCoun);
	            for(int i =2;i<rowCoun+1;i++) {
	            	Row row=sheet.getRow(i);  
	         for(int j=0;j<row.getLastCellNum();j++) {
	        	 System.out.print(row.getCell(j).getStringCellValue()+" "+"  ");      	 
	         } 
	       
	            	System.out.println();
	            } 
	}
	
	
	            }	
	
	
	
	
	
	
	
	
	
	
	

