package StreamAPI200Q;

import java.util.Map;
import java.util.stream.Collectors;

public class mapQ6 {

	public static void main(String[] args) {
	//6. Convert all keys to uppercase using streams.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"mango",60,"Cherry",30);
		
		Map<String, Integer> upper = value.entrySet().stream()
				.collect(Collectors.toMap(e -> e.getKey().toUpperCase(), Map.Entry::getValue));
		
		System.out.println(upper);
	}
}
