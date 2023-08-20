package AnnotationDemo;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestCaseDemo.test;
import Utiliy1.Id;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationDemo {

	/*public void m1() {
		System.out.println("m1 test case M1");

	}


	public void m2() {
		System.out.println("m2 test case M2");

	}*/

	@BeforeClass
	public void m9() {
		System.out.println("Before Class M9");
	}

	@AfterClass
	private void m10() {
		System.out.println("After Class M10");

	}

	@BeforeSuite
	public void m5() {
		System.out.println("Before Suite M1");

	}
	@AfterSuite
	public void m6() {
		System.out.println("After Suite  M6");

	}

	@BeforeMethod(groups="loginPage")
	public void m7() {
		System.out.println("Before Method M7");
		 test.openBrowers("Chrome");
		 test.openUrl("https://www.facebook.com/");
		 
	}

	@AfterMethod
	public void m8() {
		System.out.println("After Method M8");
		Id.driver.quit();
	}

	

	@BeforeTest
	public void m3() {
		System.out.println("Before Test  M3");

	}

	@AfterTest
	public void m4() {
		System.out.println("After Test M4");

	}
}
	
	


