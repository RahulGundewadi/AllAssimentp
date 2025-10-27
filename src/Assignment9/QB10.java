package Assignment9;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB10 {

	public static void main(String[] args) {
		//10. Create a Predicate<Double> to check if a temperature is above 37.5 (fever). Use
		//Supplier<Double> for temperature, and if true, print “High Temperature”.
		
		Supplier<Double> temp = () -> 30.0;
		
		Predicate<Double> check = t -> t > 37.5;
		
		double input = temp.get();
		
		if(check.test(input)) {
			System.out.println("High Temperature " +input );
		}else {
			System.out.println("low Temperature "+ input);
		}
	}
}
