package Assignment9;

import java.util.function.BiConsumer;

public class QB9BiCo {

	public static void main(String[] args) {
//		9. Write a BiConsumer<Integer, Integer> that prints the result of addition,
//		subtraction, multiplication, and division of the two numbers.
		
		BiConsumer<Integer, Integer> number = (a, b)->{
		System.out.println("Addition : "+(a+b));
		
		System.out.println("subtraction : "+(a-b));
		System.out.println("multiplication : "+(a*b));
		
		if(b !=0) {
		System.out.println("division : "+((double)a/b));
		}else {
			 System.out.println("Division: Cannot divide by zero!");
		}
		};
		number.accept(10, 0);
	}
}
