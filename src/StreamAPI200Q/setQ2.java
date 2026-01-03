package StreamAPI200Q;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ2 {

	public static void main(String[] args) {
//2. Convert all strings in a Set<String> to uppercase using streams.
		
		Set<String> name = new HashSet<>();
		
		name.add("rahul");
		name.add("ram");
		name.add("rohit");
		name.add("pramod");
		name.add("suraj");
		
		Set<String> upper = name.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toSet());

		System.out.println(upper);
	}
}
