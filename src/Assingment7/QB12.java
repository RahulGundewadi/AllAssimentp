package Assingment7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QB12 {

//	12. From numbers(provided at top of doc),
//	get the first 5 elements from the list.
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		for(int i=0; i<5 ; i++) {
			System.out.println(numbers.get(i));
		}
		
		
		List<Integer> firstFive = numbers.stream()
                                         .limit(5)
                                         .collect(Collectors.toList());
		
		System.out.println(firstFive);
	}
}
