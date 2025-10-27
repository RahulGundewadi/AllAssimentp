package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB30 {
//30. Create a List<String> and remove all elements whose length is less than 4 using
//	another list (donʼt use removeIf or iterator)
	public static void main(String[] args) {
	
		List<String> name = new ArrayList<String>();
		name.add("tiger");
		name.add("cat");
		name.add("lion");
		name.add("apple");
		name.add("caw");
		name.add("girl");
		
		List<String> NewName = new ArrayList<String>();
		
		for(String rem : name) {
			if(rem.length()>=4) {
				NewName.add(rem);
			}
		}
		System.out.println(NewName);
	}
}
