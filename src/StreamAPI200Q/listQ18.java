package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ18 {

	public static void main(String[] args) {
	//18. Check if all strings in a list have length greater than 3.
		
		List<String> word = Arrays.asList("mango","appplr","banana","or","eg");
		
		boolean length = word.stream()
				.allMatch(w -> w.length()>3);
		
		System.out.println(length);
	}
}
