package Assiment41;

import java.util.Scanner;

//12. Find the sum of even numbers between 1 and n .
public class QB12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum = 0;
		int i = 2;
		while(i<=n) {
			if(i%2 == 0) {
				
			sum +=i;
			i+=2;
			
		    }
			//System.out.println(sum);
	    }
		System.out.println(sum);
    
	}
}
