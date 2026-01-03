package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ4 {

	public static void main(String[] args) {
//4. Count how many strings in a Set<String> start with the letter “A
		
		Set<String> name = Set.of("Apple","Banana","Abc","orange");
		
		long startLetter = name.stream()
				.filter(n -> n.startsWith("A"))
				.count();
		
		System.out.println(startLetter);
				
	}
}
