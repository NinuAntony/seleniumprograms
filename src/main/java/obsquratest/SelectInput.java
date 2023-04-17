package obsquratest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectInput {
	WebDriver driver;
	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/select-input.php")	;
	driver.manage().window().maximize();
	}
  @Test
  public void dropdownbox() throws InterruptedException {
	  WebElement selectcolor=driver.findElement(By.id("single-input-field"));
	  Select s=new Select(selectcolor);
	  s.selectByVisibleText("Red");
	  Thread.sleep(1000);
	  s.selectByIndex(2);
	  Thread.sleep(1000);
	  s.selectByValue("Green");
	  String sel=s.getFirstSelectedOption().getText();
	  System.out.println("Selected color:"+sel);
	  
	  List<WebElement>colors=s.getOptions();
	  int size=colors.size();
	  System.out.println("size="+size);
	  
	  for(int i=0;i<size;i++)
	  {
		  String Value=colors.get(i).getText();
		  System.out.println("value ="+Value);
	  }
		  
	  
	  
  }
}
