package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;

public class listQ5 {

	public static void main(String[] args) {
	//	5. Count how many numbers in a list are greater than 10.
		
		List<Integer> number = Arrays.asList(5,45,23,6,9,11,7);
		
		long Count = number.stream()
				.filter(n -> n>10)
				.count();
		
		System.err.println("Numbers greater than 10 : " + Count);
	}
}
