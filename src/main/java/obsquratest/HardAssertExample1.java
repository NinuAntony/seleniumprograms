package obsquratest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample1 {
  @Test
  public void method1() {
	  String actual="orange";
	  String expected="orange";
	  String unexpected="apple";
	  Assert.assertEquals(actual, expected);
	  System.out.println("match");
	  Assert.assertEquals(actual, unexpected);
	  System.out.println("no match");
  }
  @Test
  public void method2()
  {
	  String actual="orange";
	  String expected="orange";
	  String unexpected="apple";
	  Assert.assertEquals(actual, expected);
	  System.out.println("match");
	  Assert.assertEquals(actual, unexpected);
	  System.out.println("no match");
  }
}
