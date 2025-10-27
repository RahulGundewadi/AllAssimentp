package Assignment8;

import java.util.HashSet;
import java.util.Set;

//17. Create a Set<String> and print the total number of 
// vowels across all strings in the set.
public class QB17 {

	public static void main(String[] args) {
		
		Set<String>  words = new HashSet<String>();
		words.add("apple");
		words.add("banana");
		words.add("orange");
		words.add("boy");
		words.add("girl");
		
		int count = 0;
		
		for(String vowel : words) {
			for(char ch : vowel.toLowerCase().toCharArray()) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
