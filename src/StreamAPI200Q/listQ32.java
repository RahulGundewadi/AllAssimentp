package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ32 {

	public static void main(String[] args) {
//32. From a list of names, find those that contain the letter
		//“e” and are longer than 4 characters
		
		List<String> name =Arrays.asList("apple","cow","elephant","tiger","abcdf");
		
		List<String> chara = name.stream()
				.filter(l -> l.toLowerCase().contains("e"))
				.filter(l -> l.length() > 4)
				.collect(Collectors.toList());
		
		System.out.println(chara);
	}
}
