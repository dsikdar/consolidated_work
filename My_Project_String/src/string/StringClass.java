package string;

public class StringClass {

	public static void main(String[] args) {
		String sentence= " Hello I am Debajyoti Sikdar , i       read in class 12";
		//statement 1: reverse the string and print
		char[] charsInString=sentence.toCharArray();
		for(int i=0;i<charsInString.length;i++)
		{	System.out.print(charsInString[charsInString.length-1 -i]);
		charsInString[i]=charsInString[charsInString.length-1 -i];
		}
		
		
		

	}

}
