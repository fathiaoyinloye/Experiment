import java.util.Scanner;

public class Separating{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a five digit number: ");
	int number = scanner.nextInt();
	
	if (number < 10000){
	System.out.println("Invalid input,please enter a five digit number.");
	}
	if (number > 99999){
	System.out.println("Invalid input,please enter a five digit number");
	}
	int digit1 = number/10000;
	int digit2 = (number % 10000) / 1000;
	int digit3 = (number % 1000) / 100;
	int digit4 = (number % 100) / 10;
	int digit5 = number % 10;
	System.out.println(digit1 + "	" + digit2 + "	" + digit3 + "	" + digit4 + "	" + digit5);
	

	
	


}
}