package StreamAPI200Q;

import java.util.Map;

public class mapQ14 {

	public static void main(String[] args) {
		//14. Check if any entry has a value equal to 100.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"App",60,"Cherry",30,"Grapes",5);

		boolean value100 = value.values().stream()
				.anyMatch(v -> v == 100);
		
		System.out.println("value equal to 100 : "  +  value100);
	}
}
