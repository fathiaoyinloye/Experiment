import java.util.Scanner;
public class Arithmetic1{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
        int first = scanner.nextInt();
	
	System.out.print("Enter second number: ");
        int second = scanner.nextInt();

	int sum1 = first + first + first;
	int sum = second + second;
	int multiple = sum / sum1;
	
	if(sum % sum1 == 0){
	System.out.println("The multiple of first and second number is: " +multiple);
	}
	else{
	System.out.println("The numbers are not multiples");
	}
	
	
	
	

}

}