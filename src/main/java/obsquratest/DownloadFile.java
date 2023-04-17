package obsquratest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DownloadFile {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/file-download.php")	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
  @Test
  public void test() {
	  WebElement enterdata=driver.findElement(By.id("textbox"));
	  enterdata.sendKeys("hai");
	  WebElement generatetext=driver.findElement(By.id("create"));
	  generatetext.click();
	  Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);
	  driver.findElement(By.id("download-file")).click();
	 
	  
  }
}
