import java.util.*;

public class StringFun {
	public static void main(String[] args) {
		//toggle case of char in string
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		Character charinput = sc.nextLine().charAt(0);
		
		if(str.length()<3)
		{
			System.out.println("String length of "+str+" is too short");
		}
		if(str.length()>10)
		{
			System.out.println("String length of "+str+" is too long");
		}
		if(check(str))
		{
			System.out.println(str +" contains non letters");
		}
		
		StringBuilder stringnew = new StringBuilder(str);
		int i = 0;
		for (i = 0; i < str.length(); i++) {
			
				if (str.indexOf(charinput,i) != -1) {
					stringnew.setCharAt(str.indexOf(charinput,i), (char) (charinput - 32));
				}
				if (str.indexOf((char) (charinput - 32),i) != -1) {
					stringnew.setCharAt(str.indexOf(charinput - 32,i), (char) (charinput));
				}
				
			}
		
		System.out.println(stringnew);
	}
	
	
	static boolean check(String s) {
	      int l=0; 
	      boolean flag=false;
	      
	      int len = s.length();
	      for (int i = 0; i < len; i++) {
	         if ((Character.isLetter(s.charAt(i)) == true)) {
	            l++;
	         }
	        
	      }
	      if(l>0)
	         return true;
		return flag;
	   }
}