package StreamAPI200Q;

import java.util.Map;

public class mapQ15 {

	public static void main(String[] args) {
		//15. Check if all values in a map are positive.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"App",60,"Cherry",30,"Grapes",5);

		boolean positive = value.values().stream()
				.allMatch(v -> v >0);
		
		System.out.println("all arre positive : "+positive);
	}
}
