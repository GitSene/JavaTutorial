// Writ a program to find Circle's area

import java.util.Scanner;
public class CircleArea {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double r;
		
	System.out.print("Enter the Radius: ");
	r = sc.nextDouble();
	
	double Area = (r * r) * Math.PI ;
	
	System.out.println( "The Area of this Circle is:  " + Area);
	
	}
	
	}

