package StreamAPI200Q;

import java.util.Map;
import java.util.stream.Collectors;

public class mapQ7 {

	public static void main(String[] args) {
	//7. Convert all values to their squares using streams
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"mango",60,"Cherry",30);
		
		Map<String, Integer> square = value.entrySet().stream()
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						e-> e.getValue()*e.getValue()));
		System.out.println(square);
	}
}
