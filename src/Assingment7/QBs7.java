package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QBs7 {

	public static void main(String[] args) {
		
		//7. Sort the list alphabetically.
				List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi",
						"melon", "apple", "mango");
				
//				List<String> sortAl = words.stream()
//						                     .sorted()
//						                     .collect(Collectors.toList());
//				
//				System.out.println(sortAl);
				
				int n = words.size();
				boolean swapped = true;
				
				while(swapped) {
					swapped = false;
					int i = 0;
					
					while(i < n-1) {
						if(words.get(i).compareTo(words.get(i+1))>0) {
							
							String temp = words.get(i);
							words.set(i, words.get(i+1));
							words.set(i+1, temp);
							swapped = true;
							
						}
						i++;
					}
				}
				System.out.println(words);
	}	
}
