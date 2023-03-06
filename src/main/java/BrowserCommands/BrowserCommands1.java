package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands1 {


	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\chrome1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.qabible.in/hrms/admin");
        driver.manage().window().maximize();
        String s=driver.getCurrentUrl();
        System.out.println(s);
        String actual="Demo HRMS | Log in";
        String s1=driver.getTitle();
        System.out.println(s1);
        if(s1.equals(actual))
        {
        	 System.out.println("title verified");	
        }
        else
        {
        	 System.out.println("tiltle mismatch");
        }
	}

}
