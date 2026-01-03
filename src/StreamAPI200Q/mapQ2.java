package StreamAPI200Q;

import java.util.Map;
import java.util.stream.Collectors;

public class mapQ2 {

	public static void main(String[] args) {
		
	//2. Print only the keys from a map using streams.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"Cherry",30);
		
		value.keySet().stream()
		.forEach(System.out::println);
	}
}
