package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ34 {

	public static void main(String[] args) {
	//34. Skip the first 3 elements in a list and print the rest
		
		List<String> element = Arrays.asList("a","b","c","d","e","f","g","h");
		
		List<String> first = element.stream()
				.skip(3)
				.collect(Collectors.toList());
		
		System.out.println(first);
	}
}
