package Assiment41;
//13. Find the sum of odd numbers between 1 and n .
public class QB13 {

	public static void main(String[] args) {
		
		int n = 10;
		int i = 1;
		
		int sum = 0;
		
		while(i<=n) {
			if(i%2 != 0) {
				sum +=i;
				i +=2;
				//System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
