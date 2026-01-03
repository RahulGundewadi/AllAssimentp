package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ20 {

	public static void main(String[] args) {
		
	//20. Collect only odd numbers from a list into a new list using streams.
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> oddNumber = number.stream()
				.filter(n -> n%2 != 0)
				.collect(Collectors.toList());
		
		System.out.println(oddNumber);
	}
}
