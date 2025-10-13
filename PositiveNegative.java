import java.util.Scanner;

public class PositiveNegative{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
 	System.out.print("Enter a number: ");
	int value = scanner.nextInt();


	switch (value) {
  	case value < 0://Boolean cannot be converted to int
  	 System.out.println("Negative");break;
  	case 0:
   	System.out.println("Zero");
	}
}
}



