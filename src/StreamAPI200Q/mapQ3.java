package StreamAPI200Q;

import java.util.Map;

public class mapQ3 {

	public static void main(String[] args) {
		
	//3. Print only the values from a map using streams.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"Cherry",30);
		
		value.values().stream()
		.forEach(System.out::println);
	}
}
