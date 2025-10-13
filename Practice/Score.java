import java.util.Scanner;

public class Score{
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
		
		if(score2 > highest){
		highest = score2;
		}
		
		if(score3 > highest){
		highest = score3;
		}
		System.out.println("The highest is: " +highest);
		
		
		int lowest = score2;
		
		if(score1 < lowest){
		lowest = score1;
		}
		
		if(score3 < lowest){
		lowest = score3;
		}
		
		System.out.println("The lowest is: " +lowest);
 		 
				
				

	

		

	}
}