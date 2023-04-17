package obsquratest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedValue {
	WebDriver driver;
  @Test
  @Parameters({"usernsme","password"})
  public void test(@Optional("abc")String a, @Optional("efg")String c) 
  {
	  //WebElement username=driver.findElement(By.xpath("//input[@name='Login']//preceding::input[2]"));
	  WebElement username=driver.findElement(By.cssSelector("input[name$=Name]"));
	  username.sendKeys(a);
	 // WebElement password=driver.findElement(By.xpath("//input[@name='Password']"));
	  WebElement password=driver.findElement(By.cssSelector("input[name^=Pass]"));
	  password.sendKeys(c);
	  WebElement login =driver.findElement(By.cssSelector("input[value*='ogi']"));
	  
	 // WebElement login =driver.findElement(By.xpath("//input[@name='UserName']//following::input[2]"));
	  login.click();
	  
	  
  }



@BeforeTest
@Parameters({"browser"})
public void window1(@Optional("chrome")String b)
{
	  
getBrowser(b);
driver.get("https://demosite.executeautomation.com/Login.html")	;

driver.manage().window().maximize();
}


@AfterTest
public void getBrowser(String br)
{
if(br.equals("chrome"))	
{
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome2\\chromedriver.exe");
	
	  driver=new ChromeDriver();
}
else
{
	  System.setProperty("Webdriver.edge.driver", "C:\\Users\\ASUS\\Desktop\\edge\\msedgedriver.exe");
	  		driver=new EdgeDriver();
	  
}
	
}
}

