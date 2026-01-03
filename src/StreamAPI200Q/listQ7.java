package StreamAPI200Q;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class listQ7 {

	public static void main(String[] args) {
	//7. Sort a list of integers in ascending order using streams
		
		List<Integer> number = Arrays.asList(10,21,1,99,63,14,5);
		
		List<Integer> sortNo = number.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sortNo);
	}
}
