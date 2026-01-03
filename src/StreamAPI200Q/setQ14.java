package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ14 {

	public static void main(String[] args) {
//14. Create a new Set<Integer> containing only odd numbers from an existing set.
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		Set<Integer> odd = number.stream()
				.filter(n -> n%2 !=0)
				.collect(Collectors.toSet());
		
		System.out.println(odd);
	}
}
