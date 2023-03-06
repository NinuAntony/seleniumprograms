package obsquratest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AssertionExample {
	WebDriver driver;
	
	@BeforeTest
	  public void example1() {
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
	  }
	
  @Test
  public void checkboxfunction() {
	
	  WebElement clickoncheckbox=driver.findElement(By.id("gridCheck"));
	  clickoncheckbox.click();
	  WebElement message=driver.findElement(By.id("message-one"));
	  String s1=message.getText();
	  boolean s=clickoncheckbox.isSelected();
	  Assert.assertEquals(s1,"Success - Check box is checked");
	  Assert.assertTrue(s);
	  Assert.assertNotNull(driver);
	  
	  
  }
  

}
