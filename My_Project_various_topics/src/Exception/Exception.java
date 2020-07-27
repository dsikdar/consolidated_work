package Exception;

public class Exception {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		int n=12;
		
			if(n<18) {
				throw new InvalidAgeException(n);
			}
	}

}
class InvalidAgeException extends Throwable{  
	 InvalidAgeException(int  n){  
	  System.out.println("age not proper "+n ); 
	 }  
	}  