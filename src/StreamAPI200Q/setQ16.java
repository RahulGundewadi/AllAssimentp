package StreamAPI200Q;

import java.util.Set;

public class setQ16 {

	public static void main(String[] args) {
//16. Count the total number of characters across all strings in a Set<String> .
		
		Set<String> word = Set.of("apple","banana","abcd","xyz");
		
		int totalCountCharacters = word.stream()
						.mapToInt(String::length)
						.sum();
		
		System.out.println(totalCountCharacters);
	}
}
