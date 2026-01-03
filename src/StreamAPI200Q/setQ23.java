package StreamAPI200Q;

import java.util.Optional;
import java.util.Set;

public class setQ23 {

	public static void main(String[] args) {
//23. Given a Set<Integer> , find the second highest number using streams.
		
		Set<Integer> number = Set.of(1,5,9,11,2,4);
		
		Optional<Integer> secondHighest = number.stream()
				.sorted((a,b)-> b-a)
				.skip(1)
				.findFirst();
		
		System.out.println(secondHighest.get());
	}
}
