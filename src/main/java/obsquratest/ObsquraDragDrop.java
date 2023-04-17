package obsquratest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ObsquraDragDrop {
WebDriver driver;

	
	@BeforeTest
	public void window1()
	{
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		  driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/drag-drop.php")	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	}
  @Test
  public void test() {
	 
	  WebElement source=driver.findElement(By.id("todrag"));
	  WebElement destination=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	  Actions act=new Actions(driver);
	act.dragAndDrop(source, destination);
	act.build().perform();
  }
}
