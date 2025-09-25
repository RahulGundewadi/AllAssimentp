package Assiment3a;

import java.util.Scanner;

//19. Odd/Even Chain Reaction
//Input three numbers.
//If all are odd → print "Odd Chain".
//If all are even → "Even Chain".
//Else → "Mixed Chain".
public class QB19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2!=0 && b%2!=0 && c%2!=0){
			System.out.println("Odd Chain");
		}else if(a%2==0 && b%2==0 && c%2==0) {
			System.out.println("Even Chain");
		}else {
			System.out.println("Mixed Chain");
		}
	}
}
