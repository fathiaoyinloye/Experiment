import java.util.Scanner;

public class Swap2{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int first = scanner.nextInt();

	System.out.print("Enter second number: ");
	int second = scanner.nextInt();
	
	if(first == first){
	first = second;
	}
	else if (second == second){
	second = first;
	}
	System.out.println("The first number is: " +first);
	System.out.println("The second number is: " +second);
		
	}
}