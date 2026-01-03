package StreamAPI200Q;

import java.util.Set;
import java.util.stream.Collectors;

public class setQ13 {

	public static void main(String[] args) {
//		13. Convert a Set<Integer> to a comma-separated string using
//		Collectors.joining() .
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		String convert = number.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(" ,"));
		
		System.out.println(convert);
	}
}
