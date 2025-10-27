package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QB5 {
//	5. Use listInteger(provided at top of doc), square every element in list 
//	and sum all of them, print sum over console.
	public static void main(String[] args) {
		
	
	List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
	//for loop
	
//	int sum = 0;
//	
//	for(int square : listInteger) {
//		int num = square*square;
//		sum = sum+num;
//		System.out.println(num);
//	}
//	System.out.println(sum);
	
	int sum = listInteger.stream()
			            .map(x -> x*x)
			            .reduce(0,Integer::sum);
	System.out.println(sum);
}
}
