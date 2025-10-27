package Assignment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QB24 {
//24. Given a List<Integer> and a Set<Integer> , print all elements from the list
//	that are not present in the set.
	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		
		Set<Integer> number1 = new HashSet<Integer>();
		number.add(2);
		number.add(4);
		number.add(6);
		
		for(Integer n : number) {
			if(!number1.contains(n)) {
				System.out.println(n);
			}
			
		}
		
	}
}
