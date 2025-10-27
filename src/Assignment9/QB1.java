package Assignment9;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//1. Use a Supplier<Integer> to provide a number, a Predicate to check if itʼs
//   positive, and a Consumer to print “Positive Number” if true.
public class QB1 {

	
	public static void main(String[] args) {
	
		Supplier<Integer> s = () -> 10;
		Predicate<Integer> number = (positive) -> positive>0;
		Consumer<Integer> PositiveNumber = (positive) ->{
			if(number.test(positive)) {
				System.out.println("positive Number");
			}
		};
		
		Integer no = s.get();
		PositiveNumber.accept(no);
	}
}
