package listenersDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestCaseDemo.test;
import Utiliy1.Id;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class listenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("===========================================================================================================");
		System.out.println("==================onTestStart=========================");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("=================onTestSuccess======================");
		System.out.println("===========================================================================================================");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("================onTestFailure====================");
		System.out.println("===========================================================================================================");
		AShot ashot = new AShot();
        Screenshot shot=ashot.shootingStrategy(ShootingStrategies.viewportPasting(1200)).takeScreenshot(Id.driver);
              // Screenshot shot =ashot.takeScreenshot(driver);
              try {
				ImageIO.write(shot.getImage(),"PNG",
				      new File("F:\\HelloWorld1\\TestNGAllDemo\\Screenshot\\test3.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
             //pdf form//
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("====================onTestSkipped=============");
		System.out.println("===========================================================================================================");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("==== onTestFailedButWithinSuccessPercentage===");
		System.out.println("===========================================================================================================");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(" ===================onStart===================");
		System.out.println("===========================================================================================================");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("===========================================================================================================");
		System.out.println("=================onFinish=====================");
		
	}
	
	
	
	

}
