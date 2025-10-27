package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB6 {
//6. Create a List<Integer> and find the maximum and minimum number using
//	enhanced for-loop.
	
	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<Integer>();
		
		number.add(100);
		number.add(170);
		number.add(1010);
		number.add(60);
		number.add(106);
		number.add(150);
		
		int max = number.get(0);
		int min = number.get(0);
		
		for(Integer num : number) {
			if(num<min) {
				min = num;
			}
			if(num>max) {
				max = num;
			}
			
		}
		System.out.println("maximum number : "+max);
		System.out.println("minimum number :"+min);
	}
}
