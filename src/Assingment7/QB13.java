package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QB13 {

//	13. From numbers(provided at top of doc),
//	skip the first 5 elements and store rest in list.
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//	    List<Integer> skip = new ArrayList<>();
//	    
//	    for(int i=5; i<numbers.size();i++) {
//	    	skip.add(numbers.get(i));
//	    }
//	    System.out.println(skip);
		
		List<Integer> skip = numbers.stream()
				                    .skip(5)
				                    .collect(Collectors.toList());
		System.out.println(skip);
	}
}
