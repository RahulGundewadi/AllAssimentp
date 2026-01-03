package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ15 {

	public static void main(String[] args) {
//15. Convert a Set<String> into a Set<Integer> representing each stringʼs length
		
		Set<String> word = Set.of("apple","banana","abcd","xyz");
		
		Set<Integer> length = word.stream()
				.map(String::length)
				.collect(Collectors.toSet());
		
		System.out.println(length);
	}
}
