package obsquratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FormSubmit {
WebDriver driver;
SoftAssert s;
	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/form-submit.php")	;
	}
	
  @Test
  public void submit() throws InterruptedException {
	  WebElement firstname=driver.findElement(By.id("validationCustom01"));
	  firstname.sendKeys("ninu");
	  Thread.sleep(2000);
	  WebElement lastname=driver.findElement(By.id("validationCustom02"));
	  lastname.sendKeys("antony");
	  Thread.sleep(2000);
	  WebElement username=driver.findElement(By.id("validationCustomUsername"));
	  username.sendKeys("ninuantony777");
	  Thread.sleep(2000);
	  WebElement city=driver.findElement(By.id("validationCustom03"));
	  city.sendKeys("thrissur");
	  Thread.sleep(2000);
	  WebElement state=driver.findElement(By.id("validationCustom04"));
	  state.sendKeys("kerala");
	  Thread.sleep(2000);
	  WebElement zip=driver.findElement(By.id("validationCustom05"));
	  zip.sendKeys("680652");
	  Thread.sleep(2000);
	  WebElement valuecheck=driver.findElement(By.id("invalidCheck"));
	  valuecheck.click();
	  boolean b= valuecheck.isSelected();
	  s=new SoftAssert();
	  s.assertTrue(b);
	  
	  WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	  submit.click();
	  String actual=submit.getText();
	  String expected="Form has been submitted successfully!";
	  s.assertEquals(actual, expected);
  }
}
