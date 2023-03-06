package obsquratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class WebElement1 {
	WebDriver driver;
	 @BeforeTest
	  public void example1() {
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
	  }
	
  @Test
  public void Verify() {
	  System.out.print("webelement");
		WebElement element=driver.findElement(By.id("single-input-field"));
		element.sendKeys("test");
		element.clear();
		element.sendKeys("print");
		WebElement showbutton=driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement message=driver.findElement(By.id("message-one"));
		String s=message.getText();
		System.out.println(s);
		WebElement twoinputfields=driver.findElement(By.className("card-header"));
		WebElement entervaluea =driver.findElement(By.id("value-a"));
		entervaluea.sendKeys(String.valueOf(5));
		WebElement entervalueb =driver.findElement(By.id("value-b"));
		entervalueb.sendKeys(String.valueOf(5));
		WebElement gettotal=driver.findElement(By.id("button-two"));
		gettotal.click();
		
		
  }
  
 
}
