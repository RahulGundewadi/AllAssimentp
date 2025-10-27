package Assignment8;

import java.util.ArrayList;
import java.util.List;

//23. Given two List<String> objects, print common elements (intersection) using
//enhanced for-loop.
public class QB23 {

	public static void main(String[] args) {
		

		List<String> name1 = new ArrayList<String>();
		name1.add("banana");
		name1.add("apple");
		name1.add("cat");
		name1.add("dog");
		
		List<String> name2 = new ArrayList<String>();
		name2.add("banana");
		name2.add("mango");
		name2.add("cat");
		name2.add("tiger");
		
		for(String c1 : name1) {
			for(String c2 : name2) {
				if(c1.equals(c2)) {
					System.out.println(c1);
				}
			}
		}
		
	}
}
