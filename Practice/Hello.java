
import java.util.Scanner;
public class Hello{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.print("Enter starting velocity in meters/second: ");
			double sv = input.nextDouble();
			System.out.print("Enter ending velocity in meters/second: ");
			double ev = input.nextDouble();
			System.out.print("Enter  time span in seconds: ");
			double ts = input.nextDouble();
			double av = (sv-ev)/ts;
			System.out.print("The average acceleration: " +av);
			

			

			
				
		
	}
	

}