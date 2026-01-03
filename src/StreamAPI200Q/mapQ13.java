package StreamAPI200Q;

import java.util.Map;

public class mapQ13 {

	public static void main(String[] args) {
	//13. Find the minimum value in a map using streams.
		
Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"App",60,"Cherry",30,"Grapes",5);
		
		int minValue = value.values().stream()
				.min(Integer::compareTo)
				.orElse(0);
		
		System.out.println(minValue);
	}
}
