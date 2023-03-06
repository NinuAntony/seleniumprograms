package annotations2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestExample {
	public WebDriver driver;
  @Test
  public void Verify() {
	  String s=driver.getCurrentUrl();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    driver.get("http://hrm.qabible.in/hrms/admin");
    driver.manage().window().maximize();
  }

@AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
