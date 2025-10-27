package Assignment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//21. Create a List<Integer> with some duplicate numbers. Convert it to a
//Set<Integer> and print both to show difference.
public class QB21 {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(10);
		number.add(11);
		number.add(13);
		number.add(10);
		number.add(15);
		number.add(13);
		System.out.println(number);
		
		Set<Integer> number1 = new HashSet<Integer>(number);
		
		System.out.println(number1);
	}
}
