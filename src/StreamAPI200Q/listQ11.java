package StreamAPI200Q;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class listQ11 {

	public static void main(String[] args) {
	//11. Find the minimum value in a list of integers using streams.
		List<Integer> number = Arrays.asList(1,8,99,5,66,77,33,101);

		System.out.println(number.stream().min(Comparator.naturalOrder()));
	}
}
