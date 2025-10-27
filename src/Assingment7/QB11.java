package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QB11 {
//	11. From numbers(provided at top of doc),
//	sort the list in reverse order.
	
	public static void main(String[] args) {
		
		List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		
//		List<Integer> sort = new ArrayList<>(listInteger);
		
//		for(int i=0; i<sort.size()-1;i++) {
//			for(int j=0; j<sort.size()-i-1;j++) {
//				if(sort.get(j)< sort.get(j+1)) {
//					
//					int tem = sort.get(j);
//					sort.set(j, sort.get(j+1));
//					sort.set(j+1, tem);
//				}
//			}
//		}
//		System.out.println(sort);
		
		List<Integer> sort = listInteger.stream()
				                        .sorted(Comparator.reverseOrder())
				                        .collect(Collectors.toList());
		
		System.out.println(sort);
	}
}
