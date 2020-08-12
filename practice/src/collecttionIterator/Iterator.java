package collecttionIterator;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
	public static void main(String [] args) {
		List<Integer> mylist=new ArrayList<>();
		mylist.add(9);
		mylist.add(7);
		mylist.add(55);
		mylist.add(9);
		
		java.util.Iterator<Integer> it = mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
