package Assignment9;

import java.util.function.Function;
import java.util.function.Supplier;

public class QB6 {

	public static void main(String[] args) {
		//6. Use a Function<Integer, Integer> to get the cube of a number. Apply it to a
		//number supplied by Supplier<Integer> and print the result.
		
		Supplier<Integer> Snumber = () -> 5;
		
		Function<Integer, Integer> Fcube = cube -> cube*cube*cube;
		
		int number = Snumber.get();
	
		int cube = Fcube.apply(number);
		
		System.out.println("Number " +number);
		
		System.out.println("Cube " + cube);
	}
}
