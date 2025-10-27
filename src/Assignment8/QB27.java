package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB27 {
//27. Create a List<String> of full names (e.g. "John Doe"). Print only the first names.
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("John Doe");
		name.add("Rahul Gundewadi");
	
		for(String first : name) {
			String firstName = first.split(" ")[0];
			System.out.println(firstName);
		}
		
	}
}
