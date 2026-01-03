package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listQ26 {

	
	public static void main(String[] args) {
	//26. Convert a list of strings into a Map<String, Integer> 
	//	where key = string, value = its length.
		
		List<String> names = Arrays.asList("rahul","sagar","pramod","aniket");
		
		Map<String,Integer> nameLength = names.stream()
				.collect(Collectors.toMap(name -> name, String::length));
		
		System.out.println(nameLength);
	}
}
