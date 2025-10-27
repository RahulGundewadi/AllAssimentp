package Assignment9;

import java.util.function.BiConsumer;

public class QB10BiCo {

	public static void main(String[] args) {
//		10. Create a BiConsumer<String, String> that prints a 
//		combined greeting message, like: "Hello Alice and Bob!".
		
		BiConsumer<String, String> print = (name1 , name2) ->
		System.out.println("Hello "+ name1 + " and " + name2 + " !");
		
		print.accept("Allice", "Bob");
	}
}
