package obsquratest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/index.php")	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
  @Test
  public void test() {
	  Actions act=new Actions(driver);
	  
	  WebElement inputform=driver.findElement(By.xpath(" //a[@href='simple-form-demo.php']"));
	  WebElement datepicker=driver.findElement(By.xpath("//a[@href='date-picker.php']"));
	 // act.doubleClick(datepicker);
	  act.contextClick(datepicker);
	  
	  act.moveToElement(inputform).moveToElement(datepicker).perform();
	  
	  
  }
}
