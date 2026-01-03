package StreamAPI200Q;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class setQ27 {

	public static void main(String[] args) {
		
//		27. Partition a Set<Integer> into even and odd using
//		Collectors.partitioningBy()
		
		Set<Integer> number = Set.of(1,2,3,4,5,6,7,8,9,10);
		
		Map<Boolean, List<Integer>> Partition = number.stream()
				.collect(Collectors.partitioningBy(n->  n%2 ==0));
		
		System.out.println("Even Number"+Partition.get(true));
		System.out.println("odd Number"+Partition.get(false));
	}
}
