package obsquratest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample1 {
	SoftAssert s;
  @Test

  public void method1() {
	  String actual="orange";
	  String expected="orange";
	  String unexpected="apple";
	  s=new SoftAssert();
	  
	  s.assertEquals(actual, expected);
	  System.out.println("match");
	  s.assertEquals(actual, unexpected);
	  System.out.println("no match");
	  s.assertAll();
  }
  @Test
  public void method2()
  {
	  String actual="orange";
	  String expected="orange";
	  String unexpected="apple";
	  s=new SoftAssert();
	  s.assertEquals(actual, expected);
	  System.out.println("match");
	  s.assertEquals(actual, unexpected);
	  System.out.println("no match");
	  s.assertAll();
  }
}