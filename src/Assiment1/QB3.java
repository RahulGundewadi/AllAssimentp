package Assiment1;

public class QB3 {
/*3. Convert following data types into provided other data types. Write complete code in one class.
	a. byte to short
	b. short to char
	c. char to int
	d. int to long
	e. long to float
	f. float to double*/
	
	public static void main(String[] args) {
		//a. byte to short
		byte b = 11;
		short sh = b;
		System.out.println(sh);
		
		//b. short to char
		short s = 12;
		char ch = (char)s;
		System.out.println(ch);
		
		//c. char to int
		char c = 'w';
		int in = c;
		System.out.println(in);
		
		//d. int to long
		int i = 15;
		long lo = i;
		System.out.println(lo);
		
		//e. long to float
		long l = 551564654l;
		float fa = l;
		System.out.println(fa);
		
		//f. float to double
		float f = 5468;
		double d = f;
		System.out.println(d);
		
	}
}
