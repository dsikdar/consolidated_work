package collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public class collection {

	public static void main(String[] args) {
		int n=9;
		List<Integer> myList=new ArrayList<Integer>(n);
		/* dynamic array to store the elements.
		 * 
		 *  Manipulation with ArrayList is slow because it internally uses an array.
		 *   If any element is removed from the array,
		 *    all the bits are shifted in memory.
		 *    
		 *    ArrayList is better for storing and accessing data
		 * */
		for(int i=0;i<n;i++) {
			myList.add(i);
		}
		for(int i : myList) {
			System.out.println(i);
		}
		System.out.println("List done");
		//list done
		List<String> myLinkedList=new LinkedList<String>();/*
		nodes cannot be accessed directly instead we need to
		 start from the head and follow through the link to 
		 reach to a node we wish to access.
		 
		 *doubly linked list to store the elements.
		 *
		 *Manipulation with LinkedList is faster than ArrayList
		 * because it uses a doubly linked list, so no bit shifting is required in memory.
		 *
		 * better for manipulating data.
		 */
		for(int i=0;i<19;i++) {
			myLinkedList.add(new Random().toString());
		}
		for(String s : myLinkedList) {
			System.out.println(s);
		}
		System.out.println("Linked list done");
		
		
		//Hash map
		/*
		 * HashMap is non synchronized
		 * HashMap allows one null key and multiple null values.
		 * HashMap is fast.
		 */
		Map<Integer , String> myHashMap=new HashMap<Integer , String>();
		myHashMap.put(10, "Tom");
		myHashMap.put(10,"Dick");//Note duplicate keys here : Run it ?
		myHashMap.put(11, "Harry");
		
		for(Integer i : myHashMap.keySet()) {
			System.out.println(" Key "+ i + " Value "+ myHashMap.get(i));
		}
		System.out.println("Hashmap done");
		//Hash map done
		
		
		/*
		 * Hashtable is synchronized. It is thread-safe and can be shared with many threads.
		 * Hashtable doesn't allow any null key or value.
		 * Hashtable is slow.
		 */
		Map<Integer , String> myHashtable=new Hashtable<Integer , String>();
		myHashtable.put(10, "Tom");
		myHashtable.put(10,"Dick");//Note duplicate keys here : Run it ?
		myHashtable.put(11, "Harry");
		
		for(Integer i : myHashtable.keySet()) {
			System.out.println(" Key "+ i + " Value "+ myHashtable.get(i));
		}
		System.out.println("Hashtable done");

		// Hash table done
		
		Iterator<Integer> mylistiterator =myList.iterator();
		while(mylistiterator.hasNext()) {
			System.out.println(mylistiterator.next());
		}
		
		//regex 
		
		
		 String REGEX = "[+91*9831]......*";// starts with +91 9831 and airtel number
		  
	        // creare the string 
	        // in which you want to search 
	        String actualString 
	            = "+91 9831676009"; 
	  
	        // compile the regex to create pattern 
	        // using compile() method 
	        Pattern pattern = Pattern.compile(REGEX); 
	  
	        // check whether Regex string is 
	        // found in actualString or not 
	        boolean matches = pattern 
	                              .matcher(actualString) 
	                              .matches(); 
	  
	        System.out.println("actualString "
	                           + "contains REGEX = "
	                           + matches); 
		
		
	}
	

}
