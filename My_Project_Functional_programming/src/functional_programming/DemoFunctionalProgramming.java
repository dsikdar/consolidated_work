package functional_programming;

import java.util.ArrayList;
import java.util.function.Consumer;

public class DemoFunctionalProgramming {
	/*
	 * pure functions, higher-order functions, lazy evaluation, closures, and currying
	 */

	public int sum(int a, int b) {//pure function
        return a + b;
    }
	
	//lambda expression (parameter1, parameter2) -> expression
	
	
	public static void main(String[] args) {
		maxFunction maxFunctionInstance= (int a , int b ) ->  (a  >  b ) ? a : b ;
		System.out.println(maxFunctionInstance.max(10,20));
		
		StringFunction askFunctionInstance = (s) -> s + "?";
		System.out.println(" Ask " + askFunctionInstance.ask("Hi"));
	
	}
	
}
