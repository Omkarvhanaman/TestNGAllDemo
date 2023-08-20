package Utiliy1;


import static  Utiliy1.Utility1.getObject;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
public class Id {
	//LOCATER FOR LOGIN PAGE//
	public static final String SINGUP_NAME= getObject("singin.name");
	public static final String SINGUP_PASSWORD=getObject("singin.Password");
	public static final String SINGUP_LOGINBUTTON=getObject("singin.loginbutton");

	      //CONSTANT VARIBALS//
	  public static WebDriver  driver;
	  public static FileInputStream file;
	  public static Properties properti1;
}
