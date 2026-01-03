package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class listQ24 {

	public static void main(String[] args) {
	//24. Given a list of numbers, find the second highest number using streams.
		
		List<Integer> number = Arrays.asList(10,20,30,11,15,25);
		
		Optional<Integer> secondHighest = number.stream()
				.distinct()
				.sorted((a,b)-> b-a)
				.skip(1)
				.findFirst();
				
		System.out.println(secondHighest);
	}
}
