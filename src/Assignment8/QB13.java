package Assignment8;

import java.util.HashSet;
import java.util.Set;

public class QB13 {
//13. Create a Set<Integer> and count how many numbers are even.
	public static void main(String[] args) {
		
		Set<Integer> number = new HashSet<Integer>();
		number.add(10);
		number.add(20);
		number.add(11);
		number.add(6);
		number.add(7);
		number.add(12);
		number.add(9);
		
		int count = 0;
		
		for(Integer even : number) {
			if(even%2==0) {
				count++;
			}
		}
			System.out.println(count);
	}
}
