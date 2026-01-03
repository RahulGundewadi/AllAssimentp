package StreamAPI200Q;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class listQ8 {

	public static void main(String[] args) {
	//	8. Sort a list of strings in descending order using streams.
		
		List<String> name = Arrays.asList("rahul","sagar","pramod","akash","nandu");
		
		List<String> sortNm = name.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(sortNm);
	}
}
