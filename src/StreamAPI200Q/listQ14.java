package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ14 {

	public static void main(String[] args) {
	//14. Filter and print only unique elements from a list using distinct() .
		
		List<Integer> number = Arrays.asList(1,2,2,3,4,4,5);
		
		List<Integer> unique = number.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(unique);
	}
}
