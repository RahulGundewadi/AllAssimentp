package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ35 {

	public static void main(String[] args) {
//35. Convert a list of lists into a single flat list of integers using flatMap() .	
		
		List<List<Integer>> lists = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5),
				Arrays.asList(6,7,8)
				);
				
		List<Integer> flatList = lists.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		System.out.println(flatList);
	}
}
