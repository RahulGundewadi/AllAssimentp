package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ20 {
	public static void main(String[] args) {
		
//20. Skip the first 2 elements from a Set<Integer> stream and print the rest.
		
        Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		Set<Integer> print = number.stream()
				.sorted()
				.skip(2)
				.collect(Collectors.toSet());
		
		System.out.println(print);
	}

}
