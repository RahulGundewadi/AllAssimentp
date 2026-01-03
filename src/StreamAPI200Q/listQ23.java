package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class listQ23 {

	public static void main(String[] args) {
	//23. Find the average of all integers in a list using streams
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		OptionalDouble average = number.stream()
				.mapToInt(Integer::intValue)
				.average();
		
		System.out.println(average);
	}
}
