package StringWork;

public class Str {

	public static void main(String[] args) {
		String cv= "My name is Debajyoti Sikdar ,"
				+ " I live in kolkata 700050 in WB , I eat meat"
				+ "Again I m Debajyoti Sikdar";
		String[] splitStr=cv.split(",");
		
		for(String item : splitStr) {
			System.out.println(item);
		}
		
		System.out.println("CV printing done");
		
		String about=cv.substring(cv.indexOf('I'));//should return from the second line
		System.out.println(about);
		
		System.out.println(cv.charAt(0));
		
		StringBuilder mystrbuilder=new StringBuilder(cv);
		mystrbuilder.setCharAt(cv.indexOf('I'), 'i');
		System.out.println(mystrbuilder);

	}

}
