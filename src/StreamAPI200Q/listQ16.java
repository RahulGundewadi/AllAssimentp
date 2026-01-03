package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ16 {

	public static void main(String[] args) {
	//16. Convert a list of integers into a list of their squares.
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		
		List<Integer> square = number.stream()
				.map( n -> n*n)
				.collect(Collectors.toList());
		
		System.out.println(square);
	}
}
