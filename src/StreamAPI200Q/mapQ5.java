package StreamAPI200Q;

import java.util.Map;

public class mapQ5 {

	public static void main(String[] args) {
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"mango",60,"Cherry",30);
	
		value.entrySet().stream()
		.filter(e -> e.getKey().startsWith("A"))
		.forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
	}
}
