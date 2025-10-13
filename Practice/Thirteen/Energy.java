import java.util.Scanner;

public class Energy{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
		/* Q = M * (finalTemperature – initialTemperature) * 4184
		where M is the weight of water in kilograms, temperatures are in degrees Celsius, 
		and energy Q is measured in joules */

		System.out.print("Enter the amount of water in kilograms: ");
		double m = scanner.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double i = scanner.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double f = scanner.nextDouble();

		
		double q = m * (f - i) * 4184;
				
		System.out.println("The energy needed is " +q);
		
	
	}
}