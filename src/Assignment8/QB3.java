package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB3 {
//3. Create a List<Integer> and print the sum of all even numbers.
	
	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		
		int even = 0 ;
		
		number.add(12);
		number.add(10);
		number.add(15);
		number.add(11);
		number.add(2);
		
		for(Integer sum : number) {
			if(sum%2 == 0) {
				even = even+sum;
				
			}
			//System.out.println(even);
		}
		System.out.println(even);
	}
}
