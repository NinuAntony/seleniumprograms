package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands1 {
	@Test
	public void Commands() throws InterruptedException
			{
				
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.wikipedia.org");
		    driver.manage().window().maximize();
		  driver.navigate().to("https://en.wikipedia.org/wiki/Apple");
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		}
		}
