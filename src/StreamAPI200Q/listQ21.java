package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ21 {

	public static void main(String[] args) {
	//21. Given a list of words, create a list of their lengths using map() .
		
		List<String> word = Arrays.asList("rahul","aksh","sagar");
		
		List<Integer> length = word.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		System.out.println(length);
	}
}
