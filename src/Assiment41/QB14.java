package Assiment41;
//14. Count the number of digits in a given number.
public class QB14 {

	public static void main(String[] args) {
		
		int i = 0055012;
		int count = 0;
		
		while(i>0) {
			i = i/10;
			count++;
		}
		System.out.println(count);
	}
}
