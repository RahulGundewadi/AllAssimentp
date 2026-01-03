package StreamAPI200Q;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class setQ9 {

	public static void main(String[] args) {
		//9. Find the minimum element in a Set<Integer> using streams.
		
		Set<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(8);
		number.add(5);
		number.add(4);
		
		Optional<Integer> min = number.stream()
				.min(Comparator.naturalOrder());
		
		System.out.println(min);
		//System.out.println(number);
	}
}
