package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB2 {
//2. Create a List<String> with names and print only those names which start with the
//	letter 'A'.
	
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("Rahul");
		name.add("Abhi");
		name.add("Ram");
		name.add("Avi");
		name.add("Pravin");
		
		System.out.println("Name Starting With A : ");
		for(String s : name) {
			if(s.startsWith("A")) {
				System.out.println(s);
			}
		}
	}
}
