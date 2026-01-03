package StreamAPI200Q;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ7 {

	public static void main(String[] args) {
//7. Remove all null or empty strings from a Set<String> using streams
		
		Set<String> name = new HashSet<>();
		name.add(" ");
		name.add("abc");
		name.add(null);
		name.add("xyz");
		
				
		Set<String> remove =  name.stream()
				.filter(s -> s != null && !s.isEmpty())
				.collect(Collectors.toSet());
		
		System.out.println(remove);
		
		
	}
}
