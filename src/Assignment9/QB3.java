package Assignment9;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB3 {

	public static void main(String[] args) {
//		3. Use a Supplier<Double> to provide a product price. If the price is greater than
//		1000 (use Predicate ), apply a 10% discount (use Function ) and print the final
//		price.
		
		Supplier<Double> Sprice = ()-> 1100.0;
		
		Predicate<Double> Greater = price -> price >1000;
		
		Function<Double, Double> FDiscount = price -> price*0.9;
		
		double price = Sprice.get();
		
		double finalPrice = Greater.test(price)? 
				
				FDiscount.apply(price):price;
		
		System.out.println(finalPrice);
	}
}
