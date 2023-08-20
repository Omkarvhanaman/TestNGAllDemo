package DataProviderDemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelFileDemo.ExcelDemo;

public class DataAnnotation {
	
	
	
	@DataProvider(name="Number data")
	public Object[] dataProvider() {
		Object obj [][]= {{12,23},{2,1},{4,3}};
		
		return obj;	
	}
	
	@DataProvider(name="LoginData")
	public Object[] LoginPage() throws Exception {
		String fileName=System.getProperty("user.dir")+("\\InputFile\\LoginData.xlsx");
			Object[][] arrObj = ExcelDemo.getExcelData(fileName, "loginPage");	
		return arrObj;	
	}
	
	
	
	
	
	
	
	
	
	

}
