package Utiliy1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility1 {
     public String getProperty(String filename,String key) {
		String value ="";
		return value;
	}
	public static String getObject(String key) {
		String value=null;
		try {
			Id.file =new FileInputStream("D:\\ecllip\\TestNGAllDemo\\InputFile\\ObjectRepository.properties");
			Id.properti1 = new Properties();	
			Id.properti1 .load(Id.file);
		value=	Id.properti1.getProperty(key);	
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public static String getProperties(String key ,String filePath)  {
        String value =null;
        try {
			FileInputStream file =new FileInputStream(filePath);
			Properties pro= new 	Properties();
			pro.load(file);
			value=	pro.getProperty(key);	
		} catch (IOException e) {
			System.out.println(" file "+filePath+"not found");
			e.printStackTrace();
		}        
		return value;
	}
	
	
	
	
	
	
	
}
