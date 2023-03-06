package obsquratest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alerts {
	WebDriver driver;
	SoftAssert s;
	
	@BeforeTest
	public void alertsexample()
	{
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
			driver.manage().window().maximize();
		    
	}
	
  @Test
  public void javascript1() throws InterruptedException {
	  WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	  clickme.click();
	  Thread.sleep(6000);
	  Alert al=driver.switchTo().alert();	
	  String a=al.getText();
	  String expected="I am a Javascript alert box!";
	  al.accept();
	  s=new SoftAssert();
	  s.assertEquals(a, expected);
	  s.assertAll();
  }
  @Test
  public void javascript2() throws InterruptedException {
	  WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	  clickme.click();
	  Thread.sleep(6000);
	  Alert al=driver.switchTo().alert();	
	  String a=al.getText();
	  String expected="Press a button!";
	  al.accept();
	  WebElement clickme1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	  clickme1.click();
	  Thread.sleep(6000);
	  Alert ale=driver.switchTo().alert();	
	  ale.dismiss();
	  s=new SoftAssert();
	  s.assertEquals(a, expected);
	  s.assertAll();
  }
  
  @Test
  public void javascript3() throws InterruptedException {
	  WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	  clickme.click();
	  Thread.sleep(6000);
	  Alert al=driver.switchTo().alert();	
	 
	 al.sendKeys("ninu");
	 String a=al.getText();
	  al.accept();
	 
	  String expected="'you have entered ninu!'";
	  s=new SoftAssert();
	  s.assertEquals(a, expected);
	  s.assertAll();
  }
}
