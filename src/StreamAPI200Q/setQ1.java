package StreamAPI200Q;

import java.util.HashSet;
import java.util.Set;

public class setQ1 {


	public static void main(String[] args) {
//1. Print all elements of a Set<Integer> using Stream API.
		
		Set<Integer> number = new HashSet<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		number.stream()
		.forEach(System.out::println);
}
}
