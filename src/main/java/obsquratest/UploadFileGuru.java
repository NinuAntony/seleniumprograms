package obsquratest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFileGuru {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/")	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
  @Test
  public void test() {
	  WebElement uploadfile=driver.findElement(By.id("uploadfile_0"));
	  driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ASUS\\Desktop\\Book1.xlsx");
	  WebElement accept=driver.findElement(By.id("terms"));
	  accept.click();
	  WebElement submit=driver.findElement(By.id("submitbutton"));
	  submit.click();
  }
}
