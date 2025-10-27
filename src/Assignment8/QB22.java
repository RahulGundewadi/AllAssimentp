package Assignment8;

import java.util.ArrayList;
import java.util.List;

//22. Given a List<String> with some names,remove duplicates manually using only
//List operations (no Set).
public class QB22 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("rahul");
		name.add("ram");
		name.add("rahul");
		name.add("sanu");
		name.add("jyoti");
		name.add("basu");
		name.add("sanu");
		name.add("ram");
		
		List<String> remove = new ArrayList<String>();
		for(String dup : name) {
			
			if(!remove.contains(dup)) {
				remove.add(dup);
				
			}
		}
		System.out.println(remove);
	}
}
