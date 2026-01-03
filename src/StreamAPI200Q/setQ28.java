package StreamAPI200Q;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ28 {

	public static void main(String[] args) {
		
//		28. Group strings in a Set<String> by their length using
//		Collectors.groupingBy() .
		
		Set<String> name = Set.of("apple","banana","kiwi","grapes","orange","ab");
		
		Map<Integer, List<String>> group = name.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(group);
	}
}
