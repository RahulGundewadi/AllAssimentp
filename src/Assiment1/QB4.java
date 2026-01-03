
package Assiment1;

public class QB4 {
/*4. Convert following data types into provided other data types. Write complete code in one class. 
a. short to byte 
b. char to short
c. int to char
d. long to int
e. float to long
f. double to float*/
	
	public static void main(String[] args) {
		
		//a. short to byte 
		
		short s = 4158;
		byte bt = (byte)s;
		System.out.println(bt);
		
		//b. char to short
		char c = 'c';
		short sh = (short)c;
		System.out.println(sh);
		
		//c. int to char
		int a = 12;
		char ch = (char)'a';
		System.out.println(ch);
		
		//d. long to int
		long l = 152659932965l;
		int in = (int)l;
		System.out.println(in);
		
		//e. float to long
		float f = 1236547;
		long lo = (long)f;
		System.out.println(lo);
		
		//f. double to float
		double d = 1532.2316;
		float fl = (float)d;
		System.out.println(fl);
	}
}
