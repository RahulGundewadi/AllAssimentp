package Assingment7;

import java.util.Arrays;
import java.util.List;

//9. From numbers(provided at top of doc),
//find the minimum[lowest] number
public class QB9 {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList( 2, 4, 6, 8, 10);
		
//		int min = number.get(0);
//		
//		for(int no : number) {
//			if(no<min) {
//				min = no;
//			}
//		}
//		System.out.println(min);
		
		int min = number.stream()
				  .min(Integer::compareTo)
				  .get();
		
		System.out.println(min);

	}
}
