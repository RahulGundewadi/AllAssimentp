package StreamAPI200Q;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ8 {

	public static void main(String[] args) {
//8. Find the maximum element in a Set<Integer> using streams
		
		Set<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(8);
		number.add(3);
		number.add(4);
		
		Optional<Integer> max = number.stream()
				.max(Integer::compareTo);

		System.out.println(max);
	}
}
