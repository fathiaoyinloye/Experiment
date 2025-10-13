import java.util.Scanner;

public class Average_Acceleration{
	public static void main(String[] args){

	Scanner	scanner = new Scanner(System.in);

	System.out.print("Enter starting velocity in meters: ");
	double v0 = scanner.nextDouble();

	System.out.print("Enter ending velocity in meters: ");
	double v1 = scanner.nextDouble();
	
	System.out.print("Enter time span in seconds: ");
	double t = scanner.nextDouble();

	double averageAcceleration = (v1 - v0)/ t;

	System.out.printf("The average velocity is %.3f%n ", averageAcceleration);







	}
}