package StreamAPI200Q;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class listQ10 {

	public static void main(String[] args) {
	//10. Find the maximum value in a list of integers using streams.
		
		List<Integer> number = Arrays.asList(1,8,99,5,66,77,33,101);
		
//		Optional<Integer> max =number.stream()
//		.max(Comparator.naturalOrder());
//		
//		System.out.println(max);
		System.out.println(number.stream().max(Comparator.naturalOrder()));
	}
}
