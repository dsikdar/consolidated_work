import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHalves {
  Main main;
  @BeforeClass
  public void setUp() {
	  main=new Main();
  }
	
  @Test(dataProvider="GetCombinations")
  public void test(String data , int output) {
	 int result=main.process(data);
	 Assert.assertEquals(result, output);
  }
  
  @DataProvider(name="GetCombinations")
  public static Object[][] GetCombinations(){
	//String[][] dataSet=new String [0][6];
	return new Object[][] 
	    	{
			{"abc",-1},//"abc";// can not be broken into two halves
			//so return value should be -1
			{"abba",1},//"abba";// even string - can be broken into halves and 
			//first and second substring contain same letters - so return value =1
			{"abcd",0},//"abcd";//can be broken into halves but two sets are different
			//so return value 0
			{"abBa",0},//"abBa"; // can be broken into halves but ab set is different
			// than set Ba - assuming the test data to be case sensitive - so return
			//value 0
			{"",0},//"";//empty input - negative test case- but as per mathematics 0 is even and the set is empty 
			//so output should not be -1 ( but its a question whether it is 0 or 1 )- so for better coverage we keep both result
			{"",1},
			{"a",-1},//"a";//odd number of characters - return value = -1
			{"\n",-1},
			//"\n" is a single character string - so it can not be broken down into halves so return value =-1  
			{null,0},
			//null is not a string so return value is neither 0 , -1 or 1 - all three tests cases should fail
			{null,1},
			{null,-1}
	    	};	
	 }
}
