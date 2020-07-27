package stativcnested;

class Outer { // static nested class
	static int n = 9;
	static class inner{
 	   void printFromInnerClass() {
 		   System.out.println("n : "+n);
    }
  } 
	public static void main(String[] args) {
			Outer outc = new Outer();
			System.out.println(outc.n);
			inner in=new Outer.inner();
			in.printFromInnerClass();
			
			
			
	}
}