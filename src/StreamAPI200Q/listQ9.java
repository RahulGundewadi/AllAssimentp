package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class listQ9 {

	public static void main(String[] args) {
	//9. Find the first element in a list using Stream API
		
		List<String> name = Arrays.asList("rahul","pramod","aniket","pratik");
		
		Optional<String> firstName = name.stream()
				.findFirst();
		
		System.out.println(firstName);
		
	}
}
