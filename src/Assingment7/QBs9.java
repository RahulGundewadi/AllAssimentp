package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QBs9 {

	public static void main(String[] args) {
		//9. Count how many times "apple" appears
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi",
				"melon", "apple", "mango");
		
		//List <String> count = new ArrayList<>();
//		int count =0;
//		for(String word : words) {
//			if(word.equals("apple")) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		long count = words.stream()
				    .filter(word -> word.equals("apple"))
				    .count();
		System.out.println("the word 'apple' appears"  +  count+  "times");
	}
}
