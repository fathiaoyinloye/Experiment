import java.util.Scanner;

public class Runaway{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
			
		System.out.print("Enter speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Enter acceleration: ");
		double acceleration = scanner.nextDouble();

		double squareSpeed = Math.pow(speed, 2);
		double speedAcceleration = squareSpeed * acceleration;
		double length = speedAcceleration / (2 * acceleration);
			
		System.out.println("The minimum runaway length of the airplane is " +length);
		
	
	}
}