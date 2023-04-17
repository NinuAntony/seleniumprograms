package obsquratest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DropDownUsingControlKey {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/select-input.php")	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
  @Test
  public void f() throws Exception {
	  WebElement selectcolor=driver.findElement(By.id("multi-select-field"));
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  Select s=new Select(selectcolor);
	  s.selectByIndex(0);
	  s.selectByValue("Yellow");
	   s.selectByVisibleText("Green");
	   WebElement firstselected=driver.findElement(By.id("button-first"));
	   firstselected.click();
	   WebElement gettext=driver.findElement(By.id("message-two"));
	   
	   String e= s.getFirstSelectedOption().getText();
	   System.out.println(e);
	  
	    
	   List<WebElement>colors=s.getOptions();
	  int size=colors.size();
	  System.out.println("size="+size);
	  
	  for(int i=0;i<size;i++)
	  {
		  String Value=colors.get(i).getText();
		  System.out.println("value ="+Value);
	  }
s.deselectAll();
		  
	  
	  
  }
}
