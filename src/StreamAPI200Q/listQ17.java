package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ17 {

	public static void main(String[] args) {
	//17. Check if any number in a list is divisible by 7 using streams.
		
		List<Integer> number = Arrays.asList(5,7,1,14,21,65);
		
		List<Integer> divisible = number.stream()
				.filter(n -> n%7 == 0)
				.collect(Collectors.toList());
		
		System.out.println(divisible);
	}
}
