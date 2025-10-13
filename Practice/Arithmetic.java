import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int first = scanner.nextInt();
	
	System.out.print("Enter second number: ");
	int second = scanner.nextInt();

	System.out.print("Enter third number: ");
	int third = scanner.nextInt();

	int sum = first + second + third;
	int average = sum / 3;
	int product = first * second * third;
	int smallest = first;
	int largest = second;

	if(second < first){
	smallest = second;
	}
	if(third < first){
	smallest = third;
	}

	if(second > first){
	largest = second;
	}
	if(third > first){
	largest = third;
	}


	System.out.println("The sum is: " +sum);
	System.out.println("The average is: " +average);
	System.out.println("The product is: " +product);
	System.out.println("The largest is: " +largest);
	System.out.println("The smallest is: " +smallest);
	}
}