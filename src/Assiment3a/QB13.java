package Assiment3a;

import java.util.Scanner;

//13. Vowel or Consonant
//Input a character.
//Check if it's a vowel (a, e, i, o, u – case insensitive) or consonant.
public class QB13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' && ch>='A' && ch>='Z' ) {
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
			System.out.println("it's a vowel");
		
		}else {
			System.out.println("it's not vowel");
		}
		
		}
	}
}
