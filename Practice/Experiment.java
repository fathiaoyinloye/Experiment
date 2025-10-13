import java.util.Scanner;

public class Experiment{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three numbers:  ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		System.out.printf("The numbers are: %d %d %d%n", num1, num2, num3);
		
		int a = num1 + num2 + num3;
		System.out.printf("Sum of the numbers is %d%n", a);

		System.out.print("Enter three names ");
		String nam1 = scanner.next();
		String nam2 = scanner.next();
		String nam3 = scanner.next();
		System.out.printf("The names are %s %s %s%n", nam1, nam2, nam3);

		
		/*int highest = num1;
		String highnam = nam1;
		if(num2 > num1){
			highest = num2;
			highnam = nam2;
		}
	
		if(num3 > highest){
			highest = num3;
			highnam = nam3;
		}
		System.out.printf("The highest number is: %d and name is %s%n", highest, highnam);*/
	}
}