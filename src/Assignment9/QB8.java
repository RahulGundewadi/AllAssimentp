package Assignment9;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class QB8 {

	public static void main(String[] args) {
		//8. Use Predicate<String> to check if a password length is at least 8. If yes, print
		//“Strong Password”. The password should be provided by Supplier<String> .
		
		Supplier<String> sPassword = () -> "Ral@123";
		
		Predicate<String> pLength = pass -> pass.length() >=8;
		
		String password = sPassword.get();
		
		if(pLength.test(password)) {
			System.out.println("Strong Password");
		}else {
			System.out.println("Weak Password");
		}
	}
}
