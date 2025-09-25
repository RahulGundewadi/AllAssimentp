package Assiment2;

public class QB4 {

	/*4. WAP to find curved surface area of following, using void method
a. Sphere
b. Cylinder
c. Cube
d. cuboid*/
	
	public void printSphere(double radius) {
		double sphere = 2*3.14*radius*radius;
		System.out.println(sphere);
	}
	
	public void printCylinder(double radius , double hight) {
		double cylinder = 2*3.14*radius*hight;
		System.out.println(cylinder);
	}
	
	public void printCube(double side) {
		double cube = 4*side*side;
		System.out.println(cube);
	}
	
	public void printCuboid(double length , double hight , double breadth) {
		double cuboid = 2*length*hight*breadth;
		System.out.println(cuboid);
	}
}
