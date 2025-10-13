import java.util.Scanner;

public class Circle{
	public static void main(String[] args){
		/* circumference = 2 * Math.PI * radius
		area = Math.PI * r^2 */
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print ("Enter the radius: ");
		double radius = scanner.nextDouble();

		double diameter = 2 * radius;	
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);

		System.out.println("The diameter of the circle: " +diameter + "cm");
		System.out.println("The circumference of the circle: " +circumference + "cm");
		System.out.println("The area of the circle: " +area  + "cm^2");
		

	}

}