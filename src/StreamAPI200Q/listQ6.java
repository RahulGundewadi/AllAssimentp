package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class listQ6 {

	public static void main(String[] args) {
//		6. Remove all null or empty strings from a list using streams.
		
		List<String> name = Arrays.asList(null,"rahul"," ","sagar");
		
		List<String> remove = name.stream()
				.filter(Objects::nonNull)
				.filter(s -> !s.trim().isEmpty())
				.collect(Collectors.toList());
		
		System.out.println(remove);
	}
}
