package deleteme;

import java.util.ArrayList;

class Outer{
	public int outVar=9;
	class Innerone{
		public int innervar=10;
		
	}
}
class GFG{
public static void main(String[] args) {

	Outer out=new Outer();
	Outer.Innerone t=out.new Innerone();
	System.out.println(out.outVar);
	System.out.println(t.innervar);
}}