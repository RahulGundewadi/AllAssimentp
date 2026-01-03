package StreamAPI200Q;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class mapQ10 {

	public static void main(String[] args) {
	
	//10. Collect values of entries with key length > 3 into a set.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"App",60,"Cherry",30,"Grapes",5);
		
		Set<Integer> length = value.entrySet().stream()
				.filter(e -> e.getKey().length()>3)
				.map(Map.Entry::getValue)
				.collect(Collectors.toSet());
		
		System.out.println(length);
	}
}
