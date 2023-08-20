package TestCaseDemo;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import DataProviderDemo.DataAnnotation;
import Utiliy1.Id;
import io.github.bonigarcia.wdm.WebDriverManager;
import listenersDemo.listenersDemo;

@Listeners(listenersDemo.class)

public class TestCaseDemo extends test  {	
	
	@Test(dataProvider ="Number data",dataProviderClass =DataAnnotation.class,groups= "numbers")
public void tc_01(int i,int j) {
	System.out.println("this Test case 01");
	System.out.println(i+"\t"+j);
	
	}

	@Test(groups= "failed")
   public void tc_02() {
	System.out.println("this Test case 02");
       assertTrue(false);
           }
	
	@Test(groups="loginPage",dataProvider ="LoginData",dataProviderClass =DataAnnotation.class)
   public void tc_03(String userName,String Password) throws InterruptedException {
	 System.out.println("this Test case 03");
	     test.entertext(Id.SINGUP_NAME,userName);
	     Thread.sleep(5000);
	     test.entertext(Id.SINGUP_PASSWORD,Password);
	     Thread.sleep(5000);
	     test.clickon(Id.SINGUP_LOGINBUTTON);
	 System.out.println("UserName:- "+userName+"\t"+"Password :- "+Password);
	  Thread.sleep(10000);
       }
	}

