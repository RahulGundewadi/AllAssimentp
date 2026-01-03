package StreamAPI200Q;

import java.util.Set;

public class setQ11 {

	public static void main(String[] args) {
//11. Check if any element in a Set<Integer> is divisible by 5 using streams.
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		boolean check = number.stream()
				.anyMatch(n -> n%5==0);
		System.out.println(check);
	}
}
