package Assiment1;

public class QB5 {
//5. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
//	Hint → 212.0 degree Fahrenheit is equal to 100.0 in Celsius.
	public static void main(String[] args) {
		
		int fahr = 212;
		
		double cel = (fahr - 32) * 5/9;
		System.out.println(cel);
	}
}
