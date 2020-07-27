import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		person2 debu=new person2();
		Class personClass=debu.getClass();
		Field[] f=personClass.getDeclaredFields();
		Method[] m=personClass.getDeclaredMethods();
		for(Field fx : f) {
			System.out.println(fx.getName());
		}
		for(Method mx : m) {
			System.out.println(mx.getName());
		}
	}

}
class person2 {
	int age = 9;
	void printAge() {
		System.out.println(age);
	}
}