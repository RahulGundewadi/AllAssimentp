package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ15 {

	public static void main(String[] args) {
		
	//15. Concatenate all strings in a list into a single comma-separated string.
		
		List<String> word = Arrays.asList("rahul","akash","suraj","pramod");
		
		String result = word.stream()
				.collect(Collectors.joining(" , "));
		
		System.out.println(result);
	}
}

