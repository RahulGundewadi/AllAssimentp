package Assignment8;

import java.util.ArrayList;
import java.util.List;

//29. Create a List<Integer> with some values. Print all elements in reverse order using
//only List methods (no Collections.reverse).
public class QB29 {

	public static void main(String[] args) {
		
		List<Integer>  value = new ArrayList<Integer>();
		
		value.add(10);
		value.add(20);
		value.add(30);
		value.add(40);
		value.add(50);
		value.add(60);
		
		for(int i = value.size()-1 ; i>=0;i--) {
			System.out.println(value.get(i));
		}
	}
}
