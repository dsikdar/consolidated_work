package quicktest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
	  SoftAssert sa=new SoftAssert();
	  sa.assertTrue(false);
	  System.out.println("executed");
	  sa.assertTrue(true);
	  System.out.println("executed too");
	  sa.assertAll();
	  
  }
}
