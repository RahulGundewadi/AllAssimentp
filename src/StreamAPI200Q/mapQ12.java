package StreamAPI200Q;

import java.util.Map;
import java.util.Optional;

public class mapQ12 {

	public static void main(String[] args) {
		
		//12. Find the maximum value in a map using streams.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"App",60,"Cherry",30,"Grapes",5);
		
		int maxValue = value.values().stream()
				.max(Integer::compareTo)
				.orElse(0);
		
		System.out.println(maxValue);

	}
}
