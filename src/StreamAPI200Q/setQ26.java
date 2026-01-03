package StreamAPI200Q;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class setQ26 {

	public static void main(String[] args) {
		
//		26. Convert a Set<String> to a TreeSet sorted 
//		    in reverse order using streams.
		
		Set<String> names = Set.of("Alice","xyz", "Bob", "Charlie", "David");
		
		TreeSet<String> reverseSet = names.stream()
				.collect(Collectors.toCollection( () -> new TreeSet<>(Comparator.reverseOrder())));
		
		System.out.println(reverseSet);
	}
}
