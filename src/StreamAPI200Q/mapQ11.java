package StreamAPI200Q;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mapQ11 {

	public static void main(String[] args) {
		
//11. Convert all map entries into a list of strings formatted as “key=value”
		
		Map<String, Integer> value = Map.of("Apple",10,"Banana",20,"App",60,"Cherry",30,"Grapes",5);
		
		List<String> list = value.entrySet().stream()
				.map(e -> e.getKey() +" = " +e.getValue())
				.collect(Collectors.toList());
		
		System.out.println(list);
	}
}
