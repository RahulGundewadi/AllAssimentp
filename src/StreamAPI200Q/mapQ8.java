package StreamAPI200Q;

import java.util.Map;

public class mapQ8 {

	public static void main(String[] args) {
		
	//8. Count how many entries have even values.
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"mango",60,"Cherry",30,"Grapes",5);
		
		long count =   value.entrySet().stream()
		.filter(e -> e.getValue()%2 == 0)
		.count();
		
		System.out.println(count);
		
	}
}
