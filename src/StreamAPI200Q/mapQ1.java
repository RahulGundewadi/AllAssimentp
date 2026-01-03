package StreamAPI200Q;

import java.util.Map;

public class mapQ1 {

	public static void main(String[] args) {
		
//1. Print all key-value pairs of a Map<String, Integer> using Stream API
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"Cherry",30);
		
		        value.entrySet().stream()
				.forEach(e -> 
				System.out.println(e.getKey()+ "="+e.toString()));
	}
}
