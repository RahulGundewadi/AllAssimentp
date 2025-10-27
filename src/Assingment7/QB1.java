package Assingment7;

import java.util.Arrays;
import java.util.List;

//1. From list of integers extract even number and print them on console.
public class QB1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		for(int no : numbers) {
			if(no%2 == 0 ) {
				System.out.println(no);
			}
		}
		         numbers.stream()
				.filter(x -> x %2 == 0 )
	            .forEach(System.out::println);
	    
	}
}
