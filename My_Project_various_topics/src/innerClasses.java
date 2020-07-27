
public class innerClasses {

	public static void main(String[] args) {
		//outer class
		int n=9;//outer class instance variable
		class inner{//nested or non static inner class
			int innerN=90;
			void printInnerclassData(){
				System.out.println("Inner n "+ innerN + " Outer n "+n);
			}
		}
		inner inn=new inner();
		inn.printInnerclassData();
		
		//method local inner class
		innerDemo d = new innerDemo();
		d.meth();
		

	}

}
class innerDemo{
	int n=9;
	void meth() {//method local inner class
		class methodLocal{
			void printFromMethLocalInnerClass() {
				System.out.println("Method local inner class sees outer scope n "+n);
			}
		}
		methodLocal t=new methodLocal();
		t.printFromMethLocalInnerClass();
	}
}




/*1) Nested Inner class
2) Method Local inner classes
3) Anonymous inner classes
4) Static nested classes*/