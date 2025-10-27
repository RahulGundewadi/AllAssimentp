package Assignment9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB7 {

	public static void main(String[] args) {
		
		//7. Create a program that uses Predicate<Integer> to check if a number is odd, and
		//if it is, print its square using Function and Consumer .
		
		int Number = 4;
		
		Predicate<Integer> POdd = n -> n %2 !=0;
		
		Function <Integer, Integer> FSquare = n -> n*n;
		
		Consumer<Integer> print  = n -> System.out.println("odd number  "  + Number+ " Square is " + n );
		
		if(POdd.test(Number)) {
			int square = FSquare.apply(Number);
			print.accept(square);
		}else {
			System.out.println(Number + " it is not a odd number");
		}
	}
}
