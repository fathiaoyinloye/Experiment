import java.util.Scanner;
	public class Convert{
		public static void main(String[] args){
			/* year = minutes / (60 *24 * 365)
			days = minutes % (60 *24 * 365)/1440 */

			Scanner scanner = new Scanner(System.in);
		
			System.out.print("Enter the number of minutes: ");
			int minutes = scanner.nextInt();

			int year = minutes/(60 *24 * 365);
			int yearRemainder =  minutes % (60 *24 * 365); 
			int day =yearRemainder /1440;
			System.out.printf("%d is approximately %d years and %d days", minutes, year, day);




	}
}