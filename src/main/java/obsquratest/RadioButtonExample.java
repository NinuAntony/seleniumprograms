package obsquratest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RadioButtonExample {
	WebDriver driver;
	SoftAssert s;
	
	@BeforeTest
	public void radiobutton()
	{
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
			driver.manage().window().maximize();
		    
	}
	
  @Test
  public void radiobuttondemo() throws InterruptedException {
	  List<WebElement>li=driver.findElements(By.name("inlineRadioOptions"));
	  Thread.sleep(3000);
	  li.get(1).click();
	  WebElement element=driver.findElement(By.id("button-one"));
	  element.click();
	  WebElement message=driver.findElement(By.id("message-one"));
	  String a=message.getText();
	 String actual="Radio button 'Female' is checked";
	 s=new SoftAssert();
	 s.assertEquals(a,actual);
	 System.out.println("verified");
	 
	 
	  li.get(0).click();
	  WebElement element1=driver.findElement(By.id("button-one"));
	  element1.click();
	  WebElement message1=driver.findElement(By.id("message-one"));
	  String b=message1.getText();
	 String actual1="Radio button 'Male' is checked";
	 s=new SoftAssert();
	 s.assertEquals(b,actual1);
	 System.out.println("verified");
	 s.assertAll();
	 
	  

	  
  }
}
