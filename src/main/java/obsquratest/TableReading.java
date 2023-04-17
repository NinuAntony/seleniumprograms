package obsquratest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableReading {
	WebDriver driver;
	
	
  @Test
  public void test() {
	  List<WebElement>col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
	  int colsize=col.size();
	  System.out.println("column size=" +colsize);
	  List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	  int rowsize=row.size();
	  System.out.println("row size=" +rowsize);
	  
	  for(int i=0;i<rowsize;i++)
	  {
		  List<WebElement>currentrow=row.get(i).findElements(By.tagName("td"));
		  for(int j=0;i<colsize;j++)
		  {
			  String readdata=currentrow.get(j).getText();
			  System.out.println("value is" +readdata);
		  }
		  
	  }
	  
  }
  
  @BeforeTest
  public void window1()
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
		
		  driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php")	;
	}
}
