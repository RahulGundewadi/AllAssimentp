package Assiment2;

public class QB5 {

	//5. WAP to find the square, cube of a single number. Input should be given through constructor.

	long a;
	
	public QB5(int num) {
	
		a = num;
	
	}
	
	
	public void printSquare() {
		
		long square = a*a;
		System.out.println(square);
	}
	
	public void printCube() {
		long cube = a*a*a;
		System.out.println(cube);
	}
	
}
