package Assiment4;
//
public class QB16 {
    //16. write a program to reverse the given Digits.
	public static void main(String[] args) {
		
	int num = 123;
	int reverse = 0;
	
	for(; num != 0; num = num/10) {
		reverse = reverse*10+(num%10);
	}
	System.out.println(reverse);
	}
}
