package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ31 {

	public static void main(String[] args) {
	//31. Remove duplicates, sort alphabetically, 
		//and collect results into a list
		
		List<String> name = Arrays.asList("cow","dog","tiger","abc","lion","abc","cow");
		
		List<String> result = name.stream()
				.distinct()
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
