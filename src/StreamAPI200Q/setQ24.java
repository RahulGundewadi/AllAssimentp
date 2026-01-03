package StreamAPI200Q;

import java.util.Optional;
import java.util.Set;

public class setQ24 {

	public static void main(String[] args) {
//24. Given a Set<Integer> , find the second smallest number using streams.
		
		Set<Integer> number = Set.of(5,2,6,1,4,3);
		
		Optional<Integer> secondSmallest = number.stream()
				.sorted()
				.skip(1)
				.findFirst();
		
		System.out.println(secondSmallest);
	}
}
