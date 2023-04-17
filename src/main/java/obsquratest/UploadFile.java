package obsquratest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFile {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	driver.get("https://demoqa.com/upload-download")	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
  @Test
  public void test() {
	  WebElement uploadfile=driver.findElement(By.id("uploadFile"));
	  driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\ASUS\\Desktop\\Book1.xlsx");
  }
}
