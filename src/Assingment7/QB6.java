package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QB6 {
//	6. Create a integer list with duplicate and remove
//	those with for loop and stream api.
	
	public static void main(String[] args) {
		List <Integer> no = Arrays.asList(1,2,3,4,1,7,5,3,6,8,5,9,7,9);
		
//		List<Integer> dup = new ArrayList<>();
//		
//		
//		for(int rem : no) {
//			if(!dup.contains(rem)) {
//				dup.add(rem);
//			}
//		}
//		System.out.println(dup);
		
		List <Integer> dup = no.stream()
				             .distinct()
				             .toList();
		System.out.println(dup);
	}
}
