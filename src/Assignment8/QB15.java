package Assignment8;

import java.util.HashSet;
import java.util.Set;

//15. Add some country names in a Set<String> , and print 
//those which end with the letter ‘aʼ.
public class QB15 {

	public static void main(String[] args) {
		
		Set<String> country = new HashSet<String>();
		
		country.add("india");
		country.add("russia");
		country.add("nepal");
		country.add("china");
		country.add("france");
		country.add("usa");
		
		for(String end : country) {
			if(end.endsWith("a")) {
			System.out.println(end);
		}
		}
	}
}
