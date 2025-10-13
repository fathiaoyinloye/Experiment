import java.util.Scanner;

public class Compare1{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int first = scanner.nextInt();

	System.out.print("Enter second number: ");
	int second= scanner.nextInt();

	System.out.print("Enter third number: ");
	int third = scanner.nextInt();

	System.out.print("Enter fourth number: ");
	int fourth = scanner.nextInt();

	System.out.print("Enter fifth number: ");
	int fifth= scanner.nextInt();
	
	int largest = first;
	
	if(second > largest){
	largest = second;
	}
	if(third > largest){
	largest = third;
	}
	if(fourth > largest){
	largest = fourth;
	}
	if(fifth > largest){
	largest = fifth;
	}
	System.out.println("The largest number is " +largest);
	
	int smallest = first;
	
	if(second < smallest){
	smallest = second;
	}
	if(third < smallest){
	smallest = third;
	}
	if(fourth < smallest){
	smallest = fourth;
	}
	if(fifth < smallest){
	smallest = fifth;
	}


	System.out.println("The smallest number is " +smallest);


		









	}
}

