// Finding  a triangle area


import java.util.Scanner;
public class TriangleArea {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] agrs) {
		
	// declare variable to hold the base and height 
	double base;
	double height;
    //variable created. move on
	System.out.print("Enter the tringle's base: ");
	base = sc.nextDouble();
	// base has been declared and filled in
	System.out.print("Enter the tringle's height: ");
	height = sc.nextDouble();
	// both variable are filled in
	double Area = (base * height)/2;
	System.out.println("The area of the triangle is: " + Area);
	}
}
