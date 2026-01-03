package StreamAPI200Q;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ6 {

	public static void main(String[] args) {
//6. Sort elements of a Set<String> alphabetically and print them.
		
		Set<String> name = Set.of("Apple","orange","banana","pink","black");
		
		List<String> alphabetical = name.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(alphabetical);
				
	}
}
