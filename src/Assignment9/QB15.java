package Assignment9;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB15 {

	public static void main(String[] args) {
//		15. Create a program where Supplier<String> provides a username. If username
//		starts with “admin” ( Predicate ), print “Access Granted”, else “Access Denied”.
		
		Supplier<String> user = () -> "admin rahul";
		
		Predicate<String> name = n -> n.startsWith("admin");
		
		String userName = user.get();
		
		if(name.test(userName)) {
			System.out.println("Access Granted");
		}else {
			System.out.println("Access Denied");
		}
	}
}
