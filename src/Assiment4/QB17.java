package Assiment4;

import java.util.Scanner;

//17. Write a Program to Check Given Number is a Palindrome or Not.
public class QB17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  
	  int original = number;
      int reverse = 0;

      // Reverse the number using for loop
      for (; number != 0; number = number / 10) {
          int digit = number % 10;
          reverse = reverse * 10 + digit;
      }

      // Check if number is palindrome
      if (original == reverse) {
          System.out.println(original + " is a Palindrome.");
      } else {
          System.out.println(original + " is not a Palindrome.");
      } 
	 
	 
	}
}
