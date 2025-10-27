package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB1 {
//1. Add 10 integers to a List<Integer> and print all elements using enhanced for-loop.
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i=1; i<= 10; i++) {
			l.add(i);
		}
		
		for(Integer v : l) {
			System.out.println(v);
		}
	}
}
