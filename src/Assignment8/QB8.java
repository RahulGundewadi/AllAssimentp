package Assignment8;

import java.util.ArrayList;
import java.util.List;

//8. Create a List<Integer> and count how many elements are divisible by 3 and 5
//both.


public class QB8 {

	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(15);
		number.add(45);
		number.add(10);
		number.add(80);
		number.add(90);
		
		for(Integer div : number) {
			if(div%3==0 && div%5==0) {
				System.out.println(div);
			}
		}
		
	}
}
