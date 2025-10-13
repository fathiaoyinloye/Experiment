import java.util.Scanner;
public class SumDigits{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter digits between 0 and 1000: ");
		int digits = scanner.nextInt();

			
		int digit1 = digits /100;
		int digit2 = (digits % 100)/10;
		int digit3= (digits % 10);
		int sumdigit = digit1 + digit2 + digit3;

		if (digits >= 1000 || digits <= 0){
		System.out.println("Invalid digits, please input digits between 0 and 1000");
		} else {
	
		
		System.out.println("Sum of digits is: " +sumdigit);
		}
		
	}
}