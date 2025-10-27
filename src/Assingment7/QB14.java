package Assingment7;

import java.util.Arrays;
import java.util.List;

//14. From numbers(provided at top of doc),
//check if all numbers are positive. [o/p - true/false]
public class QB14 {

	public static void main(String[] args) {
		
		List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		
		
//		boolean positive = true;
//		
//		for(int num : listInteger) {
//			if(num<=0) {
//				positive = false;
//				break;
//			}
//		}
//		System.out.println(positive);
		
		boolean positive = listInteger
				           .stream()
				           .allMatch(x -> x>0);
		System.out.println(positive);
	}
	
}
