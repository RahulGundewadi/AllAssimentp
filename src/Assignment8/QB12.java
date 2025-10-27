package Assignment8;

import java.util.HashSet;
import java.util.Set;

//12. Create a Set<String> of fruits and print all elements using enhanced for-loop
public class QB12 {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		for(String print : fruits) {
			System.out.println(print);
		}
	}
}
