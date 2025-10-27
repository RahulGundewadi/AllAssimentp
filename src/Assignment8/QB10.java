package Assignment8;

import java.util.ArrayList;
import java.util.List;

//10. Create a List<String> of names and print the name with the longest length.
public class QB10 {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		name.add("rahul");
		name.add("ram");
		name.add("rakesh");
		name.add("abcdefl");
		
		String longName="0";
		
		for(String l : name) {
			if(l.length()>longName.length()) {
				longName = l;
			}
		}
		System.out.println(longName);
	}
}
