package Assingment7;

import java.util.Arrays;
import java.util.List;

//8. From numbers(provided at top of doc),
//find the maximum[highest] number.
public class QB8 {

	private static final String Comparators = null;

	public static void main(String[] args) {
		
		List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		
//		int max = listInteger.get(0);
//		
//		for(int no : listInteger) {
//			if(no>max) {
//				max= no;
//			}
//		}
//		
//		System.out.println(max);
		
		int max = listInteger.stream()
				.max(Integer::compareTo)
				.get();
		System.out.println(max);
		
	}
}
