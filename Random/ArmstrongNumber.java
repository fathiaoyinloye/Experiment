import java.util.Scanner;
public class ArmstrongNumber{

	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numberToCheck = inputCollector.nextInt();
	int originalNumber = numberToCheck;

	int total = 0;
	

		while(numberToCheck > 0){
			
			int currentDigit = numberToCheck % 10;
int product = 1;
			for(int count = 1; count <= 3; count++){

				product *= currentDigit;
				
			}
				total += product;
			
				numberToCheck/=10;
		}

	if (total != originalNumber){
		System.out.print("The number is not an Armstrong Number");
	} else {
		System.out.print("The number is an Armstrong Number");

	}
	
	}
}