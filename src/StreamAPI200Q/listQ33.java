package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ33 {

	public static void main(String[] args) {
		//33. Limit the stream to the first 5 elements and collect them into a list.
		
		List<String> element = Arrays.asList("a","b","c","d","e","f","g","h");
		
		List<String> FirstFive = element.stream()
				.limit(5)
				.collect(Collectors.toList());
		
		System.out.println(FirstFive);
	}
}
