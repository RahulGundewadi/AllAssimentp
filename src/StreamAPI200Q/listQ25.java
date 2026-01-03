package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class listQ25 {

	public static void main(String[] args) {
	//25. Find the second lowest number in a list using streams
		
		List<Integer> number = Arrays.asList(10,20,30,11,15,25);
		
		Optional<Integer> secondLowest = number.stream()
				.distinct()
				.sorted()
				.skip(1)
				.findFirst();
		
		System.out.println(secondLowest);
	}
}
