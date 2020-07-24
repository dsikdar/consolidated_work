package Thread;
/* main->factorial class instantiation -> factorial class objects will run 
 * in parallel
 * Factorial class extends Thread class
 * Factorial class has public void start() method which will create 
 * the thread and start the thread
 * Business logic is there in public void run() method
 * 
 */
class factorial implements Runnable{

	Thread t;
	int result=1;
	int n;
	factorial(int n){
		 this.n=n;
	 }
	void computeFactorial() {
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
	}
	void printFactorial() {
		System.out.println("Factorial of  "+n+" is "+result);
	}
	@Override
	public void run() {
		computeFactorial();
		printFactorial();
	}
	public void start() {
		t=new Thread(this);
		t.start();
	}
}
class ThreadDemoUsingRunnable {
public static void main(String[] args) {
	for(int i=2 ; i< 6 ; i++) {
		factorial f= new factorial(i);
		
		f.start();
		
	}
	
}
}