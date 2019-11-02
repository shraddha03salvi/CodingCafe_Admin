package Generic;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements IAutoConstant
{
	// Instance of webdriver
		public static WebDriver driver;
		static {
			// Set the path of firefox browser and chrome browser
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			System.setProperty(CHROME_KEY, CHROME_VALUE);
		}

		// Call the @BeforeMethod annotaion of testng it will run the code before method
		// execution
		@BeforeMethod
		public void openApplication() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			String url = Lib.getProperty(CONFIG_PATH,"URL"); 
			driver.get(url); 
			String ITO = Lib.getProperty(CONFIG_PATH,"ImplicitTimeOut"); 
			int timeoutPeriod = Integer.parseInt(ITO); 
			driver.manage().timeouts().implicitlyWait(timeoutPeriod,TimeUnit.SECONDS);
		}

		// Call the @AfterMethod annotaion of testng it will run the code after method
		// execution
		@AfterMethod
		public void screenShot(ITestResult result) {
			if (ITestResult.FAILURE == result.getStatus()) {
				try {
					// To create reference of TakesScreenshot
					TakesScreenshot screenshot = (TakesScreenshot) driver;
					Date d = new Date();
					String currentdate = d.toString().replaceAll(":", "_");
					// Call method to capture screenshot
					File src = screenshot.getScreenshotAs(OutputType.FILE);

					// Copy files to specific location
					File destFile = new File(".\\ScreenShot\\" + currentdate + "\\" + "_screenshot.png");
					FileUtils.copyFile(src, destFile);

				} catch (Exception e) {
					System.out.println("Exception while taking screenshot " + e.getMessage());
				}
			}
			// To close the browser
			driver.close();
		}

}
