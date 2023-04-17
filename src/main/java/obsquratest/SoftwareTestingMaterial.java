package obsquratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftwareTestingMaterial {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		  driver=new ChromeDriver();
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/")	;
	driver.manage().window().maximize();
	}
  @Test
  public void test() {
	  WebElement textfield=driver.findElement(By.xpath("//input[@class='spTextField']"));
	  textfield.sendKeys("ninu");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("ninu77777");
	  
  }
}
