package Assignment8;

import java.util.HashSet;
import java.util.Set;

//26. Given a Set<String> of words, create a new Set<String> with all words in
//lowercase.
public class QB26 {

	public static void main(String[] args) {
		
		Set<String> word = new HashSet<String>();
		word.add("ABC");
		word.add("DEF");
		word.add("GHI");
		word.add("JKL");
		word.add("MNO");
		
		Set<String> NewWord = new HashSet<String>();
		
		for(String l : word) {
			NewWord.add(l.toLowerCase());
			
		}
		System.out.println(NewWord);
	}
}
