import java.util.Scanner;
public class Cost{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
		//cost = (Distance / MPG) * price per gallon
		System.out.print("Enter the driving distance: ");
		double distance = scanner.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double mpg = scanner.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double ppg = scanner.nextDouble();

		
		double cost = (distance/mpg) * ppg;
				
		System.out.println("The cost of driving is  $" +cost);
		
	
	}
}