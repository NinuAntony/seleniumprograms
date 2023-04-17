package obsquratest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Iframetest {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  int size=driver.findElements(By.tagName("iframe")).size();
	  System.out.println("iframe size="+size);
	  driver.switchTo().frame(7);
	  driver.findElement(By.xpath("html[1]/body[1]")).click();
	  System.out.println("iframe found");
	  driver.switchTo().parentFrame();
	  System.out.println("SWITCHING SUCCESSFUL");
	  driver.switchTo().frame("a077aa5e");
	  driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
  }
  
  @BeforeTest
  public void window1()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/")	;
    driver.manage().window().maximize();
	}
}


