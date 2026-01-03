package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ17 {

	public static void main(String[] args) {
//		17. Print only distinct lowercase versions of all strings in a Set<String> .
		
		Set<String> word = Set.of("Apple","Banana","APPLE","Kiwi","banana");
		
		Set<String> distinctLowercase = word.stream()
				.map(String::toLowerCase)
				.distinct()
				.collect(Collectors.toSet());
		
		System.out.println(distinctLowercase);
	}
}
