import java.io.Serializable;

public class Various {

	public static void main(String[] args) {

		person p=new person();
		System.out.println(p.age);
		p=null;
		//Runtime.getRuntime().exec(command);
		System.gc();// garbage collection
		height h= height.MEDIUM;//enum
		System.out.println(h);
		h.enumMethod();//enum method
		
		
		

	}

}
class person   {
	int age =10;
	protected void finalize() {
		System.out.println("Garbage collected ");
	}
}
enum height{
	TALL,
	MEDIUM,
	SHORT;
	
	void enumMethod() {
		System.out.println("Enum method");
	}
	
}