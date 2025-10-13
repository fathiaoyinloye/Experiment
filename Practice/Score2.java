import java.util.Scanner;

public class Score2{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter first name: ");
		String first = scanner.nextLine();

		System.out.print("Enter second name: ");
		String second = scanner.nextLine();
	
		System.out.print("Enter third name: ");
		String third = scanner.nextLine();
		

		System.out.print("Enter first name score: ");
		int score1 = scanner.nextInt();

		System.out.print("Enter second name score: ");
		int score2 = scanner.nextInt();
	
		System.out.print("Enter third name score: ");
		int score3 = scanner.nextInt();

		int highest = score1;
		String hname = first;
		
		if(score2 > highest){
		highest = score2;
		hname = second;
		}
		
		if(score3 > highest){
		highest = score3;
		hname = third;
		}
		System.out.println(hname + " scored the highest which is " +highest);

		int lowest = score2;
		String lname = second;
	
		if(score1 < lowest){
		lowest = score1;
		lname = first;
		}

		if(score3 < lowest){
		lowest = score3;
		lname = third;
		}
		System.out.println(lname + " scored the lowest which is " +lowest);
		
		
		
				
				

	

		

	}
}