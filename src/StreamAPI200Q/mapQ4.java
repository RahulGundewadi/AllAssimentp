package StreamAPI200Q;

import java.util.Map;
import java.util.stream.Collectors;

public class mapQ4 {

	public static void main(String[] args) {
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"mango",60,"Cherry",30);
		
		value.entrySet().stream()
		.filter(e -> e.getValue()>50)
		.forEach(e -> System.out.println(e.getKey()+ " = " +e.getValue()));
		
	}
}
