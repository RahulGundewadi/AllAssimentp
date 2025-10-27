package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QBs10 {

	public static void main(String[] args) {
		//10. Count words with length exactly 5
		// Expected output: 2 (grape, mango)
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		int count=0;
//		
//		for(String word : words) {
//		       if(word.length()==5) {
//		    	   count++;
//		       }
//		}
//		System.out.println(count);
		
		long count = words.stream()
				.filter(word ->word.length()==5)
				.count();
		System.out.println(count);
		
	}
}
