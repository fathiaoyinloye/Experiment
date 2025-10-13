import java.util.Scanner;

public class Line{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your date of birth: ");
		int date = scanner.nextInt();

		System.out.print("How much do you weight: ");
		double weight = scanner.nextDouble();

		System.out.print("Are you married? (true/false): ");
		boolean married = scanner.nextBoolean();

		System.out.println("My name is " +name);
		System.out.println("I was born in " + date + " by a beautiful mother");
		System.out.println("I weight " + weight + "Kg");
		
		if(married){
		System.out.println("You cannot visit me");
		}
		else{
		System.out.println("You can visit me");
		}

		



	}
		

}