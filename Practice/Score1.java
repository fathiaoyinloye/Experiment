import java.util.Scanner;

public class Score1{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter first name: ");
		String first = scanner.next();
		System.out.print("Enter score: ");
		int score1 = scanner.nextInt();


		System.out.print("Enter second name: ");
		String second = scanner.next();
		System.out.print("Enter score: ");
		int score2 = scanner.nextInt();
	
		System.out.print("Enter third name: ");
		String third = scanner.next();
		System.out.print("Enter score: ");
		int score3 = scanner.nextInt();

		if (score1 > score2 && score1 > score3){
		System.out.println("The highest is " +first + "and score is" +score1);
		}
		if (score2 > score1 && score2 > score3){
		System.out.println("The highest is " +second + "and score is" +score2);
		}
		if (score3 > score2 && score3 > score1){
		System.out.println("The highest is " +third + "and score is" +score3);
		}
		if (score1  score2 && score1 > score3){
		System.out.println("The highest is " +first + "and score is" +score1);
		}
		if (score2 > score1 && score2 > score3){
		System.out.println("The highest is " +second + "and score is" +score2);
		}
		if (score3 > score2 && score3 > score1){
		System.out.println("The highest is " +third + "and score is" +score3);
		}

		
	
		}



}