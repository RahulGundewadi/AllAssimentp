package Assignment9;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB4 {

	//4. Use a Supplier<Integer> to generate an age, and use a Predicate to check
	//if itʼs eligible for voting (>=18). Print “Eligible” or “Not Eligible” accordingly.
	
	public static void main(String[] args) {
		
		Supplier<Integer> SAge = () -> 17;
		
		Predicate<Integer> voting = age -> age >= 18;
		
		int age = SAge.get();
		
		System.out.println("Generated age" +  age);
		
		if(voting.test(age)) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
	}
}
