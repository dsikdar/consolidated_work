package practiseTestNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=3)
  public void f1() {
	  System.out.println("f1");
  }
  
  @Test(priority=2)
  public void f2() {
	  System.out.println("f2");
  }
  
  @Test(priority=1)
  public void f3() {
	  System.out.println("f3");
  }
  
  
  
}
