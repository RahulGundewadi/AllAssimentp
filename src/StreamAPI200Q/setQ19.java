package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ19 {
	
	public static void main(String[] args) {
//19. Limit a stream from a Set<Integer> to the first 3 elements and print them.
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		Set<Integer> print = number.stream()
				.limit(3)
				.collect(Collectors.toSet());
		
		System.out.println(print);
	}

}
