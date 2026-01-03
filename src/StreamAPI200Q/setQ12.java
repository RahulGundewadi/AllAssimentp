package StreamAPI200Q;

import java.util.Set;

public class setQ12 {

	public static void main(String[] args) {
//12. Check if all elements in a Set<Integer> are positive numbers.
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		boolean check = number.stream()
				.allMatch(n -> n>=0);
		
		System.out.println(check);
	}
}
