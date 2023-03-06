package Testmethods;

import org.testng.annotations.Test;

public class MultipleTest {
  @Test
  public void methdod1() {
	  System.out.println("first method");
	  
  }
  @Test(groups= {"smoke"})
  public void methdod2() {
	  System.out.println("second method");
	  
  }
  @Test(groups= {"smoke","regression"})
  public void methdod3() {
	  System.out.println("third method");
	  
  }
  @Test(groups= {"regression"})
  public void methdod4() {
	  System.out.println("fourth method");
	  
  }
  @Test
  public void methdod5() {
	  System.out.println("fifth method");
	  
  }
}
