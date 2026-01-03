package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;

public class listQ12 {

	public static void main(String[] args) {
	//12. Count how many elements are in a list using Stream API
		List<Integer> number = Arrays.asList(1,8,99,5,66,77,33,101);

		long count = number.stream().count();
		System.out.println(count);
		//System.out.println(number.stream().count());
	}
}
