package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class QB5 {
//5. Create a List<Double> of prices. Print only those prices that are greater than 100.
	public static void main(String[] args) {
		
		List<Double> prices = new ArrayList<Double>();
		prices.add(100.12);
		prices.add(10d);
		prices.add(101.12);
		prices.add(90.12);
		prices.add(100d);
		prices.add(120.25);
		
		for(Double print : prices) {
			if(print>100) {
				System.out.println("the  prices  are greater than 100."+print);
			}
		}
	}
}
