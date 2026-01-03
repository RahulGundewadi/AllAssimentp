package StreamAPI200Q;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ21 {

	public static void main(String[] args) {
		//21. Given a Set<String> , create a Map<String, Integer> 
		//(key = string, value = length).
		
		Set<String> word = Set.of("Apple","banana","kiwi");
		
		Map<String ,Integer> WordLength= word.stream()
				.collect(Collectors.toMap(w -> w, String::length));
			
		System.out.println(WordLength);
	}
}
