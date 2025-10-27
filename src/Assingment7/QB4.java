package Assingment7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QB4 {
//4. Use listInteger(provided at top of doc) list to generate output as list
//	output →4,16,36,64,100.
	public static void main(String[] args) {
	
		List<Integer> listInteger = Arrays.asList(2,4,6,8,10);
		
//		//for loop
//		for(int square : listInteger) {
//			int num = square*square;
//			System.out.println(num);
//		}
		
		//List<Integer> square = listInteger.stream()
//		                         .map(x -> x*x)
//		                         .sorted()
//		                         .toList();
		List<Integer> square = listInteger.stream()
				               .map(x -> x*x)
				               .collect(Collectors.toList());
		System.out.println(square);
	}
}
