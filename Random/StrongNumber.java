import java.util.Scanner;
public class StrongNumber{

	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numberToCheck = inputCollector.nextInt();
	int originalNumber = numberToCheck;

	int total = 0;
	

		while(numberToCheck > 0){
			
			int currentDigit = numberToCheck % 10;
int product = 1;
			for(int count = 1; count <= currentDigit; count++){

				product *= count;
				
			}
				total += product;
			
				numberToCheck/=10;
		}

	if (total != originalNumber){
		System.out.print("The number is not a Strong Number");
	} else {
		System.out.print("The number is a Strong Number");

	}
	
	}
}