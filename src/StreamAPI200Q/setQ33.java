package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class setQ33 {

	public static void main(String[] args) {
		
//33. Given two sets, find their union using Stream API.
		
		Set<Integer> set1 = Set.of(1,2,3,4,5);
		Set<Integer> set2 = Set.of(4,5,6,7,8);
		
		Set<Integer> union = Stream.concat(set1.stream(), set2.stream())
				.collect(Collectors.toSet());
		
		System.out.println(union);
	}
}
