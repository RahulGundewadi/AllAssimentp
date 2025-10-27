package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QB10 {
//10. From numbers(provided at top of doc),
//count how many numbers are greater than 4.
	
	public static void main(String[] args) {
		
		List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		
//		int count = 0;
//		
//		for(int num : listInteger) {
//			if(num>4) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		
		
		long min = listInteger.stream()
				             .filter(x -> x >4)
				             .count();
		
		System.out.println(min);

	}
}
