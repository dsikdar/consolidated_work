import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String num1 = br.readLine();
		String num2 = br.readLine();
		
		
	    int n1 = Integer.parseInt(num1);
	    int n2 = Integer.parseInt(num2);
	    
	    int prod1 = n1 * n2;
	    
	    String revNum1 = "" + num1.charAt(1) + num1.charAt(0);
	    String revNum2 = "" + num2.charAt(1) + num2.charAt(0);
	    
	    int irevNum1 = Integer.parseInt(revNum1);
	    int irevNum2 = Integer.parseInt(revNum2);
	    
	    int prod2 = irevNum1 * irevNum2;
		
	    if(prod1==prod2)
	    	System.out.println(num1 + " and " + num2 + " are correct pair");
	    else
	     	System.out.println(num1 + " and " + num2 + " are not correct pair");
	}
		   	
}

