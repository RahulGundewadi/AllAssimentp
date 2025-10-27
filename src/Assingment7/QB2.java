package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. From list of integers extract even number and return them in list.
public class QB2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List <Integer> even = new ArrayList<Integer>();
		for(int no : numbers) {
			if(no % 2 == 0) {
				even.add(no);
			}
		}
		System.out.println(even);
		//////////////////
		List<Integer> evenNo = numbers.stream()
				               .filter(x -> x%2 ==0)
				               .collect(Collectors.toList());
		
		System.out.println(evenNo);
	}
}
