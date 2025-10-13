import java.util.Scanner;
public class Two{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int first = input.nextInt();

	System.out.print("Enter second number: ");
	int second = input.nextInt();

	int sum = first + second;

	System.out.printf("Sum of both numbers is %d ",sum );
	System.out.printf("The first number is %d and the second number is %d%n", first,second);


	}
}