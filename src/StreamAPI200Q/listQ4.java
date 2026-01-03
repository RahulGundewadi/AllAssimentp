package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ4 {

	public static void main(String[] args) {
		//4. Given a list of strings, 
		//filter those starting with the letter “A”.
		
		List<String> name = Arrays.asList("rahul","akash","sagar");
		
		List<String> start = name.stream()
				.filter(nm -> nm.startsWith("a"))
				.collect(Collectors.toList());
		
		System.out.println(start);
		
		//start.forEach(System.out::println);
	}
}
