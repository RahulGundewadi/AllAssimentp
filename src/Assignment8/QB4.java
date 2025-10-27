package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB4 {
	//4. Create a List<String> and count how many names have more than 5 characters.
	
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		int count = 0;
		
		name.add("rahul");
		name.add("sanika");
		name.add("jyotiG");
		name.add("poojaB");
		name.add("vidya");
		
		for(String ch : name) {
			if(ch.length()>5) {
				count++;
			}
		}
		System.out.println("more than 5 characters : " +count);
	}

}
