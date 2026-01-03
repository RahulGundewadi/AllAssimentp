package StreamAPI200Q;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ18 {

	public static void main(String[] args) {
//18. Convert a Set<Integer> to a List<Integer> using streams.
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> listNo = number.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(listNo);
	}
}
