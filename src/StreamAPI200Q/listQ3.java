package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ3 {

	public static void main(String[] args) {
		//3. Given a list of strings, 
		//convert all to uppercase using streams.
		
		List<String> name = Arrays.asList("rahul","jyoti","sanika");
		
		List<String> upperCase = name.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(upperCase);
		//upperCase.forEach(System.out::println);
	}
}
