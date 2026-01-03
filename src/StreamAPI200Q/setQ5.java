package StreamAPI200Q;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ5 {

	public static void main(String[] args) {
//5. Convert a Set<Integer> to a sorted list using Stream API.
		Set<Integer> number = Set.of(31,20,13,4,15,61,7,8,9,10);
		
		List<Integer> sort = number.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sort);
	}
}
