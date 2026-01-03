package StreamAPI200Q;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ29 {

	public static void main(String[] args) {
		
	
//29. Create a map of the first character to all strings starting with that character
	
	Set<String> word = Set.of("apple","banana","kiwi","orange","grapes","xyz","asd");
	
	Map<Character, List<String>>group = word.stream()
			.collect(Collectors.groupingBy(s -> s.charAt(0)));
	
	System.out.println(group);
	}
}
