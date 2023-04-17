package obsquratest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshots {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
			driver.manage().window().maximize();
	
	}
  @Test(priority=1)
  public void wikipedia1() {
	  driver.get("https://selenium.obsqurazone.com/file-download.php")	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
  }
  
  @Test(priority=2)
  public void wikipedia2() {
	  driver.get("https://www.seleniumeasy.com/selenium-tutorials/waits-and-timeout-selenium-4")	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
}
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException
  {
	  if(ITestResult.SUCCESS==r.getStatus())
	  {
		  File f= ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("C:\\Users\\ASUS\\Desktop\\seleniumscreenshot\\"+ r.getName()+ ".png"));
  }
  }
  }
  
  
