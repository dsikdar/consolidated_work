
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrapper classes
		Byte b=9;
		Short s=8;
		Integer i=88;
		Long l=888L;
		
		Float f=8.8f;
		Double d=7.7;
		
		Character  c='j';
		Boolean b2=true;
		
		System.out.println(b.intValue()==9);
		
		//unboxing
		int ii=i;//Integer in int
		System.out.println(ii);
		
		//boxing
		float test=9.8f;
		Float testF=test;
		System.out.println(testF);
		//wrapper class - boxing - unboxing completed
		
		demo demotest=new demo();
		demotest.printValue();
		
		

	}

}
class demo{//illustrates static block in a class
	static int i;
	static {
		i=90;
	}
	void printValue(){
		System.out.println("Static i -> "+i);
	}
	
	
}


	
	

