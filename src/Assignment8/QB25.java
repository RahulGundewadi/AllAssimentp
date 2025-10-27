package Assignment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//25. Create a List<String> and a Set<String> . Print elements that are present in
//both
public class QB25 {

	public static void main(String[] args) {
		
		List<String> element = new ArrayList<String>();
		element.add("a");
		element.add("b");
		element.add("c");
		element.add("d");
		element.add("e");
		element.add("f");
		
		Set<String> element1 = new HashSet<String>();
		element1.add("a");
		element1.add("c");
		element1.add("e");
		
		for(String both : element) {
			if(element1.contains(both)) {
				System.out.println(both);
			}
		}
	}
}
