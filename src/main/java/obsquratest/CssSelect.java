package obsquratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CssSelect {
	WebDriver driver;

		
		@BeforeTest
		public void window1()
		{
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
			
			  driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php")	;
		}
  @Test
  public void test() throws InterruptedException {
	  WebElement firstname=driver.findElement(By.cssSelector("input#validationCustom01"));
	  firstname.sendKeys("ninu");
	  Thread.sleep(2000);
	  WebElement lastname=driver.findElement(By.cssSelector("input[placeholder=\"Last name\"]"));
	  lastname.sendKeys("antony");
	  Thread.sleep(2000);
	  WebElement username=driver.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
	  username.sendKeys("ninuantony777");
	  Thread.sleep(2000);
	  WebElement city=driver.findElement(By.cssSelector("input#validationCustom03"));
	  city.sendKeys("thrissur");
	  Thread.sleep(2000);
	  WebElement state=driver.findElement(By.cssSelector("input[placeholder=\"State\"]"));
	  state.sendKeys("kerala");
	  Thread.sleep(2000);
	  WebElement zip=driver.findElement(By.cssSelector("input#validationCustom05"));
	  zip.sendKeys("680652");
	  Thread.sleep(2000);
	  WebElement valuecheck=driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
	  valuecheck.click();
	
	  
	  WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	  submit.click();
	  
	  
  }
}
