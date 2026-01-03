package StreamAPI200Q;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listQ22 {

	public static void main(String[] args) {
	//22. Given a list of sentences, extract all unique words using flatMap()	
		
		List<String> sentence = Arrays.asList( "Java is fun",
	            "Streams are powerful",
	            "Java streams are useful");
	
		List<String> unique = sentence.stream()
				.flatMap(uni -> Arrays.stream(uni.split(" ")))
				.collect(Collectors.toList());
		
		System.out.println(unique);
	}
}
