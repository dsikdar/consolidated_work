package threadwork;
class mySum extends Thread{
	Thread t;
	int a ;
	int b;
	public void run() {
		printSum();
	}
	mySum(int a , int b){
		this.a=a;
		this.b=b;
	}
	void printSum() {
		System.out.println("concat of "+ a + " and "+ b+"= " + a+b);
	}
	
	public void start() {
		t = new Thread();
		t.start();
	}
}

public class ThreadWork {

	public static void main(String[] args) {
		Thread t;
		for(int i=0;i<7;i++)
		{
			t=new Thread(new mySum(i,i+1));
			t.start();
		}
		
		

	}

}
