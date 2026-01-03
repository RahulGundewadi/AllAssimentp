package StreamAPI200Q;

import java.util.OptionalDouble;
import java.util.Set;

public class setQ22 {

	public static void main(String[] args) {
//22. Given a Set<Integer> , find the average value using Stream API.
		
		Set<Integer> number  = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		OptionalDouble average = number.stream()
				.mapToInt(Integer::intValue)
				.average();
			
		System.out.println(average);
	}
}
