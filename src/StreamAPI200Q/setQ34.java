package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ34 {

	public static void main(String[] args) {
		
//34. Given two sets, find their difference (elements only in first set).
		
		Set<Integer> set1 = Set.of(1,2,3,4);
		Set<Integer> set2 = Set.of(3,4,5,6);
		
		Set<Integer> difference = set1.stream()
				.filter(e -> !set2.contains(e))
				.collect(Collectors.toSet());
		
		System.out.println(difference);
	}
}
