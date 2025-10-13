import java.util.Scanner;

public class EvenOdd{
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

	if(first % 2 == 0){
	even1 = first;
	}
	else if(first % 2 != 0){
	odd1 = first;
	}
	if(second % 2 == 0){
	even2 = second;
	}
	else if(second % 2 != 0){
	odd2 = second;
	}
	if(third % 2 == 0){
	even3 = third;
	}
	else if(third % 2 != 0){
	odd3 = third;
	}
	if(fourth % 2 == 0){
	even4 = fourth;
	}
	else if(fourth % 2 != 0){
	odd4 = fourth;
	}
	
	sumeven = even1 + even2 + even3 + even4;
	sumodd = odd1 + odd2 + odd3 + odd;

	System.out.println("The sum of even number is: " +sumeven);
	System.out.println("The sum of odd number is: " +sumodd);


	}
}