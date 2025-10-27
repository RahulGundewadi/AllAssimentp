package Assiment41;
//15. Find the sum of digits in a given number.
public class QB15 {

	public static void main(String[] args) {
		
		int n = 134;
		int sum = 0;
		int r;
		
		while(n>0) {
			r = n%10;
			sum = sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
