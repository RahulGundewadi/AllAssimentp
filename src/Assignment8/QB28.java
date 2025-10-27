package Assignment8;

import java.util.HashSet;
import java.util.Set;

//28. Create a Set<String> of colors. Convert all elements to uppercase and store in a
//    new set. Print both.
public class QB28 {

	public static void main(String[] args) {
		
		Set<String> color = new HashSet<String>();
		color.add("red");
		color.add("yellow");
		color.add("pink");
		color.add("black");
		color.add("white");
		color.add("orange");
		
		Set<String> UpperCase = new HashSet<String>();
		
		for(String up : color) {
			UpperCase.add(up.toUpperCase());
		}
		System.out.println(UpperCase);
	}
}
