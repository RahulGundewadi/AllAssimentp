package StreamAPI200Q;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ25 {

	public static void main(String[] args) {
		
//		25. Convert a Set<List<Integer>> into a flat
//		List<Integer> using flatMap() .
		
		Set<List<Integer>> setOfList = new HashSet();
		
		setOfList.add(Arrays.asList(1,2,3));
		setOfList.add(Arrays.asList(4,5,9));
		setOfList.add(Arrays.asList(6,0,7,8));
		
		List<Integer> flatList = setOfList.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		System.out.println(flatList);
	} 
}
