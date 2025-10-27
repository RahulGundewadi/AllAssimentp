package Assignment8;

import java.util.HashSet;
import java.util.Set;

// 11. Add 10 integers to a Set<Integer> (include some duplicates). Print the set to
// observe how duplicates are handled.
public class QB11 {

	public static void main(String[] args) {
		
		Set<Integer> number = new HashSet<Integer>();
		
		number.add(90);
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(10);
		number.add(50);
		number.add(60);
		number.add(90);
		number.add(70);
		number.add(10);
		number.add(20);
		
		for(Integer num : number) {
			System.out.println(num);
		}
	}
}
