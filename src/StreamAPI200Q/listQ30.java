package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ30 {

	public static void main(String[] args) {
//30. Join all strings in a list with “ - ” 
	//as separator using Collectors.joining() .
		
		List<String> name = Arrays.asList("asd gf","xyz ","mno pq");
		
		String join = name.stream()
				.collect(Collectors.joining(" - "));
		
		System.out.println(join);
	}
}
