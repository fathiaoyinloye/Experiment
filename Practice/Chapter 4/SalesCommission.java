/* 	initialiaze the fixed amount recieved by salesperson per week to be 200
	create a variable for total sales and assign zero to it
	create a variable for the amount of times sales will be inputed call it count
	enter all the weeks sales, since the sales is more than one, prompt the user to continue input their sales till all sales have ben entered
	there should be a number that will be entered to signifies the end of inputing sales items
	all sales should be added to total
	calculate 9% of the total sales and add to fix payment
	print out the total payment															*/



import java.util.Scanner;

public class SalesCommission{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int receivables = 200;

		int count = 0;
		int total = 0;
		while(count != -1){

		System.out.print("Enter week sales: ");
		int sales = scanner.nextInt();

		total = total + sales;

		System.out.print("Enter -1 if all sales have been inputed or enter any number to continue: ");
		count = scanner.nextInt();
		
		}
		System.out.println(total);


		double sales_interest = total * 9 / 100;
		System.out.println(sales_interest);

		double total_receivables = receivables + sales_interest;
		System.out.printf("The total receivables is %.2f%n", total_receivables);

	}
}