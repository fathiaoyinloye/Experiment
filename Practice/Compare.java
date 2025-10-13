import java.util.Scanner;

public class Compare{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	int square = number * number;
	
	if(100 > number){
	System.out.println("100 is greater than " +number);
	}
	if(100 == number){
	System.out.println("100 is equal to " +number);
	}
	if(100 != number){
	System.out.println("100 is not equal to " +number);
	}
	if(100 < number){
	System.out.println("100 is less than " +number);
	}
	
	if(100 > square){
	System.out.println("100 is greater than " +square);
	}
	if(100 == square){
	System.out.println("100 is equal to " +square);
	}
	if(100 != square){
	System.out.println("100 is not equal to " +square);
	}
	if(100 < square){
	System.out.println("100 is less than " +square);
	}

	}
}

