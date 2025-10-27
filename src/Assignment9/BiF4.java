package Assignment9;

import java.util.function.BiFunction;

public class BiF4 {

	public static void main(String[] args) {
//		4. Write a BiFunction<Double, Double, Double> that calculates
//		the area of a rectangle (length × breadth) and prints the result.
		
		BiFunction<Double, Double, Double> cal = (length, breadth)-> length*breadth;
		
		double print = cal.apply(5.0, 3.0);
		
		System.out.println(print);
	}
}
