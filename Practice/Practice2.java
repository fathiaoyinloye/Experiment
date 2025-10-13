import java.util.Scanner;

public class Table{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int count = 0;
		int digit = 0;
		int original = number;
		int reverse =  0;

		while (number > 0){
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		if(original == reverse){
			System.out.print(" The number is a Palindrome");
		}
		else {
			System.out.println( "The number is not a Palindrome");
		}

	}
}
