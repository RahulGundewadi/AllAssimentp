package Assignment8;

import java.util.ArrayList;
import java.util.List;

//7. Create a List<String> of names and print all names in uppercase using enhanced
//for-loop.
public class QB7 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("rahul");
		name.add("ram");
		name.add("rakesh");
		name.add("vishal");
		
		for(String n : name) {
		
			System.out.println(n.toUpperCase());
		}
	}
}
