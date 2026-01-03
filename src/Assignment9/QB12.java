package Assignment9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class QB12 {

	public static void main(String[] args) {

		//12. Create a Supplier<List<String>> to provide a list of names. Use a
		//Consumer<List<String>> to print each name using enhanced for-loop.

		Supplier<List<String>> sName = () -> Arrays.asList("Rahul","Ram","Jyoti","Sanika");

		Consumer<List<String>> cPrint = name -> {
			System.out.println("List of Name");
			for(String names : name) {
				System.out.println(names);
			}
		};
		List<String> names = sName.get();

		cPrint.accept(names);
	}
}
