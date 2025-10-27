package Assingment7;

import java.util.Arrays;
import java.util.List;

//3. count odd integers from list of integer.
public class QB3 {

	public static void main(String[] args) {
//		//for loop
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		
//		int odd = 0 ;
//		
//		for(int no : number) {
//			if(no%2!=0) {
//				//System.out.println(no);
//				odd = odd+1;
//				
//			}
//		}
//		System.out.println(odd);
		
		long oddNo = number.stream()
				.filter(x -> x %2 !=0)
				.count();
		System.out.println(oddNo);
	}
}
