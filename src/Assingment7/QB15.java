package Assingment7;

import java.util.Arrays;
import java.util.List;

//15. From numbers(provided at top of doc),
//check if any number is divisible by 7.[o/p - true/false]
public class QB15 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(7,2,1,3,4,5);
		
//		boolean divisible = false;
//		
//		for(int num : numbers) {
//			if(num%7==0) {
//				divisible = true;
//				break;
//			}
//		}
//		System.out.println(divisible);
		
		boolean divisible = numbers.stream()
				          .anyMatch(x ->x%7 == 0);
		
		System.out.println(divisible);
		
	}
}
