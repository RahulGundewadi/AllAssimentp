package Assiment2;
/*3. WAP with parameterized method to calculate Area of following shapes
a. Square
b. Rectangle
c. Circle
d. Rhombus*/

public class QB3 {

	public void printSquare(double side) {
		double s = side*side;
		System.out.println("Square is "  +s);
	}
	
	public void printRectangle(double length, double width) {
		double R = length*width;
		System.out.println("Rectangle is "  +R);
	}
	
	public void printCircle(double radius) {
		double C = radius*radius;
		System.out.println("Circle is "  +C);
	}
	
	public void printRhombus(double d1 , double d2) {
		double RH = (d1*d2);
		System.out.println("Rhombus is "  +RH);
	}
}
