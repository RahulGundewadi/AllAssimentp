package Assignment9;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB5 {

	public static void main(String[] args) {
		//5. Create a Predicate<String> to check if a string starts with “A”. Use it with a
		//Supplier<String> that supplies a name. If it matches, print “Name Accepted”.
		
		Supplier<String> SName = () -> "Aniket";
		
		Predicate<String> PStart = name-> name.startsWith("A");
		
		String name = SName.get();
		
		System.out.println("Name " + name);
		
		if(PStart.test(name)) {
			System.out.println("Name Accepted");
		}else {
			System.out.println("Name Rejected");
		}
	}
}
