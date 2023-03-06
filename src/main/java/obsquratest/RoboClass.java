package obsquratest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RoboClass {
	WebDriver driver;
	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php")	;
	}
  @Test
  public void nexttab() throws Exception {
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  
	  String currenttab=driver.getWindowHandle();
	  System.out.println("current tab is:"+currenttab);
	  Set<String>allTabs=driver.getWindowHandles();	  
	  System.out.println("all tabs:"+allTabs);
	  int q=allTabs.size();
	  System.out.println("size="+q);
	  String s1=(String)allTabs.toArray()[0];
	  String s2=(String)allTabs.toArray()[0];
	  driver.switchTo().window(s2);
	  driver.get("https://en.wikipedia.org/wiki/Wiki");
	  
	  
  }
}
