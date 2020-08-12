/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int process(String str) {
        /* 
         * Modify this method to process `str` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	int length=str.length();
    	if(length%2!=0)
    		return -1;
    	else
    	{
    		String s1 = str.substring(0, (str.length()/2));
    		String s2 = str.substring((str.length()/2));
    		
    		char[] s1Chars=s1.toCharArray();
    		char[] s2Chars=s2.toCharArray();
    		
    		Arrays.sort(s1Chars);
    		Arrays.sort(s2Chars);
    		if(Arrays.equals(s1Chars,s2Chars)) {
    			return 1;
    		}
    		
    		else
    			return 0;
    	}
    }

    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            String line = in.nextLine().trim();
            int retVal = process(line);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
