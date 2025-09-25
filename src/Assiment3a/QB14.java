package Assiment3a;

import java.util.Scanner;

//14. ATM Withdrawal
//Input balance and withdrawal amount.
//If withdrawal is a multiple of 100 and ≤ balance, approve. Else reject.
public class QB14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total balance");
		long balance = sc.nextLong();
		System.out.println("Enter withdrawal amount");
		long withdrawal = sc.nextLong();
		
		if(balance>withdrawal && withdrawal%100==0) {
			System.out.println("approve");
		}else {
			System.out.println("reject");
		}
		}
		
		
	}

