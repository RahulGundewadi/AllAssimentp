package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ3 {

	public static void main(String[] args) {
//3. Filter and print only even numbers from a Set<Integer> .
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		Set<Integer> even = number.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toSet());
		
		System.out.println(even);
	}
}
