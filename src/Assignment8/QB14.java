package Assignment8;

import java.util.HashSet;
import java.util.Set;

//14. Create a Set<String> and print all elements whose length is exactly 4.

public class QB14 {

	public static void main(String[] args) {
		
		Set<String> name = new HashSet<String>();
		name.add("ram");
		name.add("rama");
		name.add("sanu");
		name.add("rahul");
		name.add("abc");
		
		for(String w : name){
			if(w.length()==4) {
				System.out.println(w);
			}
		}
	}
}
