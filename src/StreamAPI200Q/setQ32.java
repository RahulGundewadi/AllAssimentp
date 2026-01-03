package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ32 {

	public static void main(String[] args) {
		
//32. Given two sets, find their intersection using Stream API.
		
		Set<Integer> set1 = Set.of(1,2,3,4,5);
		Set<Integer> set2 = Set.of(3,4,5,6,7);
		
		Set<Integer> intersection = set1.stream()
				.filter(set2::contains)
				.collect(Collectors.toSet());
		
		System.out.println(intersection);
	}
}
