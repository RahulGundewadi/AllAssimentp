package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ30 {

	public static void main(String[] args) {
		
//30. Remove all strings longer than 5 characters from a Set<String> using streams
		
		Set<String> word = Set.of("apple","banana","kiwi","orange","grapes","xyz","asd");
	
		Set<String> remove = word.stream()
				.filter(s -> s.length() <= 5)
				.collect(Collectors.toSet());
		
		System.out.println(remove);
	}
}
