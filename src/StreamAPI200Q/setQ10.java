package StreamAPI200Q;

import java.util.Set;

public class setQ10 {

	public static void main(String[] args) {
//10. Calculate the sum of all integers in a Set<Integer> using reduce()
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		int sum = number.stream()
				.reduce(0,(a,b)-> a+b);
	
		System.out.println(sum);
	}
}
