package obsquratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
WebDriver driver;
	
	@BeforeTest
	  public void example1() {
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	}
  @Test
  public void multiplecheckbox() {
	  WebElement checkboxone=driver.findElement(By.id("check-box-one"));
	  checkboxone.click();
	  boolean a=checkboxone.isSelected();
	  SoftAssert s=new SoftAssert();
	  s.assertTrue(a);
	  String s1=driver.getTitle();
	  String expected="Obsqura Testing";
	  s.assertEquals(s1,expected);
	  s.assertAll();
  }
}
