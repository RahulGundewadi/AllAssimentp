package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ31 {

	public static void main(String[] args) {
		
//31. Find all strings in a Set that contain a digit using streams and regex.
		
		Set<String> word = Set.of("apple2","banana1","kiwi","orange","grapes","xyz25","12asd");
		
		String reg = ".*\\d.*";
		
		Set<String> regex = word.stream()
				.filter(s -> s.matches(reg))
				.collect(Collectors.toSet());
		
		System.out.println(regex);
	}
}
