package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listQ28 {

	public static void main(String[] args) {
	//28. Partition a list of integers into even and odd using partitioningBy() .
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Map<Boolean,List<Integer>> Partition = number.stream()
				.collect(Collectors.partitioningBy(n -> n %2 ==0));
		
		//System.out.println(Partition);
		System.out.println("Even "+ Partition.get(true));
		System.out.println("odd  "+Partition.get(false));
	}
}
