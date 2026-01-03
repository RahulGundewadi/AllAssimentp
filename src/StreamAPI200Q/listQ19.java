package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;

public class listQ19 {

	public static void main(String[] args) {
	//19. Get the sum of all integers in a list using reduce() .
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6);
		
		int sum = number.stream()
				.reduce(0, (a , b)-> a+b);
		System.out.println(sum);
	}
}
