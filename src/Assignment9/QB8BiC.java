package Assignment9;
import java.util.function.BiConsumer;

public class QB8BiC {

	public static void main(String[] args) {
//		8. Create a BiConsumer<String, Integer> that prints a
//		formatted message like:"Name: John, Age: 25".
		
		BiConsumer<String, Integer> print = (name, age)->
		System.out.println("Name : " +name + "  Age  : "+age);
		
		print.accept("rahul", 23);
	}
}
