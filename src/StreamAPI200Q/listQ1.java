package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;

public class listQ1 {

	public static void main(String[] args) {
		//1. Print all elements of a list using Stream API.
		
		List<String> name =  Arrays.asList("Rahul","sanika","jyoti","pooja");
		
		name.stream()
		    .forEach(System.out::println);
	}
}
