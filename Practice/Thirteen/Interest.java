import java.util.Scanner;

public class Interest{
	public static void main(String[] args){
	Scanner scanner =new Scanner(System.in);
	
	System.out.print("Enter balance: ");
	double balance = scanner.nextDouble();
	
	System.out.print("Enter annual percentage interest rate: ");
	double annint = scanner.nextDouble();

	double monint = annint / 1200;
	
	double nextint = balance * monint;
	
	System.out.println("The interest on the next monthly payment: " + nextint);

	}
}