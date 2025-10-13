import java.util.Scanner;

public class Triangle2{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter first point x1: ");
	double x1 = scanner.nextDouble();
	
	System.out.print("Enter first point y1: ");
	double y1 = scanner.nextDouble();

	System.out.print("Enter second point x2: ");
	double x2 = scanner.nextDouble();

	System.out.print("Enter second point y2: ");
	double y2 = scanner.nextDouble();

	System.out.print("Enter third point x3: ");
	double x3 = scanner.nextDouble();

	System.out.print("Enter third point y3: ");
	double y3 = scanner.nextDouble();

	double a = (x2 - x1) * (x2 - x1);
	double b =(y2 - y1) * (y2 - y1);
	double sumab = a + b;
	double side1 = Math.sqrt(sumab);
	
	double c = (x3 - x2) * (x3 - x2);
	double d =(y3 - y2) * (y3 - y2);
	double sumcd = c + d;
	double side2 = Math.sqrt(sumcd);

	double e =(x1 - x3) * (x1 - x3);
	double f =(y1 - y3) * (y1 - y3);
	double sumef = e + f;
	double side3 = Math.sqrt(sumef);


	double s = (side1 + side2 + side3) / 2;
	double area =Math.sqrt(s*((s - side1)*(s - side2)*(s - side3)));

	System.out.println("Enter three points of a triangle: " +x1 +"  " +y1 + "  " + x2 +"  " +y2 + "  " + x3 +"  " +y3);
	System.out.println("The area of triangle is: " +area);


	

	
	
	



	}
}