package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;

public class listQ2 {

	public static void main(String[] args) {
		//2. Given a list of integers,
		//print only even numbers using streams.
		
		List<Integer> number = Arrays.asList(10,11,22,15,13,4,9,6);
		
//		List<Integer> na = number.stream()
//		.filter(n -> n%2 == 0)
//		.toList();
//		System.out.println(na);
		
		number.stream()
		.filter(n -> n%2 == 0)
		.forEach(System.out::println);
	}
}
