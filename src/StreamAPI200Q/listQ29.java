package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;

public class listQ29 {

	public static void main(String[] args) {
//29. Given a list of integers, find the product of all numbers using reduce() .
		
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		
		int product = number.stream().reduce(1, (a,b) -> a*b);
		
		System.out.println(product);
	}
}
