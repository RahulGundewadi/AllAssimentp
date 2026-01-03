package StreamAPI200Q;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mapQ9 {

	public static void main(String[] args) {
	//9. Collect keys of entries with value > 10 into a list.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"mango",60,"Cherry",30,"Grapes",5);
		
		List<String> keys = value.entrySet().stream()
				.filter(e -> e.getValue() > 10)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		System.out.println(keys);
	}
}
