package TestCaseDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import AnnotationDemo.AnnotationDemo;
import Utiliy1.Id;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test extends AnnotationDemo   {
	  	
public static void openBrowers(String browersName  ) {	
		switch (browersName) {	
case"Chrome":
			WebDriverManager.chromedriver().setup();
			Id.driver = new ChromeDriver();
			break;
			
case"Firefox":
			WebDriverManager.firefoxdriver().setup();
			Id.driver = new FirefoxDriver();
			break;		
		}		
	}	
	
public static void openUrl(String  url ) {
		Id.driver.get(url);
	}
	
	
	public static WebElement  getWebelement(String  locaterType,String locaterValue ) {
		WebElement element=null;
		switch(locaterType) {
		case"Xpath":
		     element =	Id.driver.findElement(By.xpath(locaterValue));
			break;
		case"CSS":
			element =	Id.driver.findElement(By.cssSelector(locaterValue));
			break;
		case"Class":
			element =	Id.driver.findElement(By.className(locaterValue));
			break;
		case"ID":
			element =	Id.driver.findElement(By.id(locaterValue));
			break;
			default:
				System.err.println("invalid locater");
		}
		return element;
	}
	
	@Deprecated
	public static void entertext(String  locaterType,String locaterValue,String totext) {

		getWebelement(locaterType,locaterValue).sendKeys(totext);
	}
	
	
	@Deprecated
	public static void clickOn(String  locaterType, String locaterValue)  {

		getWebelement(locaterType,locaterValue).click();
	}
	 /**
     * this is singalton ues letest methode direct Split String using object through 
     * @param object
     *@author omkar vhanamani
     * @param text
     */
    public static void entertext(String object,String text) {
		String [] part=object.split("##");
		 getWebelement(part[0], part[1]).sendKeys(text);
	}
  

    public static void clickon(String object) {
		String [] part=object.split("##");
		 getWebelement(part[0], part[1]).click();
    
    } 
	
}